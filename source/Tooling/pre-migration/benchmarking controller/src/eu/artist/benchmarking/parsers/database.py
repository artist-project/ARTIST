#!/usr/bin/env python
# ARTIST Benchmarking Controller
# Copyright 2014 Engineering Ingegneria Informatica S.p.A.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#
# Initially developed in the ARTIST EU project, www.artist-project.eu

"""Provides interfaces with persistence layer

"""

import MySQLdb
import datetime
import time

__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"


ts = time.time()
st = datetime.datetime.fromtimestamp(ts).strftime('%Y-%m-%d %H:%M:%S')



def database(Time,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12):
    if Tool == 'Filebench':
        mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
        cursor = mydb.cursor()
        cursor.execute('INSERT INTO test.Filebench(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Ops,OpsPerSecond,ReadWrite,MbPerSecond,CpuOperations,Latency) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r",%s,"%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f))
        mydb.commit()
        cursor.close()
        print "data stored!!"
    else:
        if Tool == 'DaCapo':
            mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
            cursor = mydb.cursor()
            cursor.execute('INSERT INTO test.DaCapo(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,PerformanceTime_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,%s)',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a))
            mydb.commit()
            cursor.close ()
            print "data stored!!"
        else:
            if Tool.startswith('YCSB'):
                if Workload.startswith('workloada'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"
                if Workload.startswith('WorkloadB'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"
                if Workload.startswith('WorkloadC'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"
                if Workload.startswith('WorkloadD'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,Tool,SIZE_ID,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"
                if Workload.startswith('WorkloadE'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"
                if Workload.startswith('WorkloadF'):
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.YCSB(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Runtime_ms,Throughput_ops_sec,UPDATE_Operations,UPDATE_Averagelatency_ms,UPDATE_MinLatency_ms,UPDATE_MaxLatency_ms,UPDATE_95thPercentileLatency_ms,UPDATE_99thPercentileLatency_ms,READ_Operations,READ_Averagelatency_ms,READ_MinLatency_ms,READ_MaxLatency_ms,READ_95thPercentileLatency_ms,READ_99thPercentileLatency_ms,INSERT_Operations,INSERT_Averagelatency_ms,INSERT_MinLatency_ms,INSERT_MaxLatency_ms,INSERT_95thPercentileLatency_ms,INSERT_99thPercentileLatency_ms,SCAN_Operations,SCAN_Averagelatency_ms,SCAN_MinLatency_ms,SCAN_MaxLatency_ms,SCAN_95thPercentileLatency_ms,SCAN_99thPercentileLatency_ms,READ_MODIFY_WRITE_Operations,READ_MODIFY_WRITE_Averagelatency_ms,READ_MODIFY_WRITE_MinLatency_ms,READ_MODIFY_WRITE_MaxLatency_ms,READ_MODIFY_WRITE_95thPercentileLatency_ms,READ_MODIFY_WRITE_99thPercentileLatency_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))
                    mydb.commit()
                    cursor.close ()
                    print "data stored!!"                   
            else:
                if Tool == 'CloudSuite':
                    mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                    cursor = mydb.cursor()
                    cursor.execute('INSERT INTO test.DataCaching(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,TimeDiff,Rps,Requests,Gets,Sets,Hits,Misses,Avg_lat,90th,95th,99th,Standard_Deviation,Min,Max,AvgGetSize,RpsParameter,Connections,Cpus,QoS_ms) VALUES (%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n,o,p,q,r,s,t,u))
                    mydb.commit()
                    cursor.close () 
                    print "data stored!!"
                else:
                    if Tool=='Dwarfs':
                        mydb = MySQLdb.connect(host='127.0.0.1',user='root',passwd='root',db='test')
                        cursor = mydb.cursor()
                        cursor.execute('INSERT INTO test.Dwarfs(Time,CloudProvider,User,InstanceType,Tool,Workload,Platform,Number_of_runs,Structured_Grid_Scores,MapReduce_MonteCarlo_Scores,Dense_Matrix_Scores,Sparse_Matrix_Scores,Graph_Traversal_Scores,Particle_Scores,Spectral_Scores,Livermore_Scores,DryStone_Scores,MemoryBDW_Scores,IOZone_Scores) VALUES (%s,%s,%s,%s,%s,%s,%s,%s,"%r","%r","%r","%r","%r","%r","%r","%r","%r","%r","%r")',(st,CloudProvider,User,SIZE_ID,Tool,Workload,Platform,a,b,c,d,e,f,g,h1,i,l,m,n))
                        mydb.commit()
                        cursor.close ()  
                        print "data stored!!"
                    #else:
                     #   print "No data to store!!!"
        