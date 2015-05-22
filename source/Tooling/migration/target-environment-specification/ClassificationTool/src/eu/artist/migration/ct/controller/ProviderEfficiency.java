/*
 * Copyright 2015 ICCS/NTUA 
 * Licensed under the Eclipse Public License(EPL) version 1.0 License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.eclipse.org/legal/epl-v10.html
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors: Athanasia Evangelinou
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

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
