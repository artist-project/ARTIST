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

public class WorkloadInfo {
	private String workloadId;
	private String tableName;
	private String workloadName;
	private String metricName;
	
	public static final WorkloadInfo[] workloadInfos = new WorkloadInfo[] {
						 //workload_id				table_name		workloadName			metricName
		new WorkloadInfo("DaCapo	avrora",		"DaCapo",		"avrora",				"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	eclipse",		"DaCapo",		"eclipse",				"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	fop",			"DaCapo",		"fop",					"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	h2",			"DaCapo",		"h2",					"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	jython",		"DaCapo",		"jython",				"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	pmd",			"DaCapo",		"pmd",					"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	tomcat",		"DaCapo",		"tomcat",				"PerformanceTime_ms"),
		new WorkloadInfo("DaCapo	xalan",			"DaCapo",		"xalan",				"PerformanceTime_ms"),
		new WorkloadInfo("Filebench	fileserver",	"Filebench",	"fileserver",			"Latency"),
		new WorkloadInfo("Filebench	varmail",		"Filebench",	"varmail",				"Latency"),
		new WorkloadInfo("Filebench	webserver",		"Filebench",	"webserver",			"Latency"),
		new WorkloadInfo("Filebench	webproxy",		"Filebench",	"webproxy",				"Latency"),
		new WorkloadInfo("Filebench	videoserver",	"Filebench",	"videoserver",			"Latency"),
		new WorkloadInfo("YCSB a", 					"YCSB",			"workloada_Mysql_JDBC",	"1/Throughput_ops_sec"),
		new WorkloadInfo("YCSB b", 					"YCSB", 		"workloadb_Mysql_JDBC",	"1/Throughput_ops_sec"),
		new WorkloadInfo("YCSB c", 					"YCSB",			"workloadc_Mysql_JDBC",	"1/Throughput_ops_sec"),
		new WorkloadInfo("YCSB d", 					"YCSB",			"workloadd_Mysql_JDBC",	"1/Throughput_ops_sec"),
		new WorkloadInfo("YCSB e", 					"YCSB",			"workloade_Mysql_JDBC",	"1/Throughput_ops_sec"),
		new WorkloadInfo("YCSB f", 					"YCSB",			"workloadf_Mysql_JDBC",	"1/Throughput_ops_sec"),
	};
	
	public static WorkloadInfo findWorkload(String workloadId) {
		for (WorkloadInfo workloadInfo: workloadInfos) {
			if (workloadInfo.getWorkloadId().matches(workloadId)) {
				return workloadInfo;
			}
		}
		
		return null;
	}
	
	public WorkloadInfo(String workloadId, String tableName,
			String workloadName, String metricName) {
		super();
		this.workloadId = workloadId;
		this.tableName = tableName;
		this.workloadName = workloadName;
		this.metricName = metricName;
	}

	public String getWorkloadId() {
		return workloadId;
	}

	public String getTableName() {
		return tableName;
	}

	public String getWorkloadName() {
		return workloadName;
	}

	public String getMetricName() {
		return metricName;
	}
}
