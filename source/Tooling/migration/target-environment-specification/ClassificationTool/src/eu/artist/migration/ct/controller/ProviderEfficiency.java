package eu.artist.migration.ct.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import eu.artist.migration.ct.common.IniReader;

public class ProviderEfficiency {
	private String workloadId;
	private double minPrice;
	private double maxPrice;
	private double minPerformance;
	private double maxPerformance;
	
	public ProviderEfficiency(String workloadId) {
		this.workloadId = workloadId;
	}
	
	private void setMinMaxPrices(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		try {
			ResultSet resultSet = statement.executeQuery("SELECT MIN(Price) min, MAX(Price) max FROM Price");
			resultSet.next();
			minPrice = resultSet.getDouble("min");
			maxPrice = resultSet.getDouble("max");
		}
		finally {
			statement.close();
		}
	}
	
	private void setMinMaxPerformance(Connection connection, WorkloadInfo wInfo) throws SQLException {
		Statement statement = connection.createStatement();
		try {
			ResultSet resultSet = statement.executeQuery("SELECT MIN(aveg) min, MAX(aveg) max " +
														 "FROM " +
														 "( " +
														 	"SELECT AVG(" + wInfo.getMetricName() +") aveg " +
														 	"FROM " + wInfo.getTableName() + " " +
														 	"WHERE Workload = '" + wInfo.getWorkloadName() + "' " +
														 	"GROUP BY CloudProvider, InstanceType " +
														 ") AS memTable;");
			resultSet.next();
			minPerformance = resultSet.getDouble("min");
			maxPerformance = resultSet.getDouble("max");
		}
		finally {
			statement.close();
		}
	}
	
	private String getMostEfficientProvider(Connection connection, WorkloadInfo wInfo) throws SQLException {
		IniReader ini = IniReader.getInstance();
		Statement statement = connection.createStatement();
		try {
			ResultSet resultSet = statement.executeQuery(
					"SELECT CloudProvider, InstanceType, " +
					"1 / ( (" + ini.getPerformanceWeight() + " * NormalizedPerformance) + (" + ini.getPriceWeight() + " * NormalizedPrice) ) AS ServiceEfficiency " +
					"FROM " +
					"( " +
						"SELECT dc.CloudProvider, dc.InstanceType, " +
						"(1 + (9 * (AVG(" + wInfo.getMetricName() + ") - " + minPerformance + ") / (" + maxPerformance + " - " + minPerformance + ") )) AS NormalizedPerformance, " +
						"(1 + (9 * (Price - " + minPrice + ") / (" + maxPrice + " - " + minPrice + ") )) AS NormalizedPrice " +
						"FROM " + wInfo.getTableName() + " dc " +
						"JOIN Price pr " +
						"ON dc.InstanceType = pr.InstanceType " +
						"WHERE Workload = '" + wInfo.getWorkloadName() + "' " +
						"GROUP BY dc.CloudProvider, dc.InstanceType " +
					") AS memTable " +
					"ORDER BY ServiceEfficiency DESC " +
					"LIMIT 1");
			resultSet.next();
			return resultSet.getString("CloudProvider") + " " + resultSet.getString("InstanceType");
		}
		finally {
			statement.close();
		}
	}
	
	public String calculateBestProvider() throws Exception {
		WorkloadInfo wInfo = WorkloadInfo.findWorkload(workloadId);
		if (wInfo == null) {
			throw new Exception("Workload_id: " + workloadId + " is not a recognized workload_id. Please check your training file.");
		}
		setMinMaxPrices(DbConnection.getConnection());
		setMinMaxPerformance(DbConnection.getConnection(), wInfo);
		return getMostEfficientProvider(DbConnection.getConnection(), wInfo);
	}

	public String getWorkloadId() {
		return workloadId;
	}
}
