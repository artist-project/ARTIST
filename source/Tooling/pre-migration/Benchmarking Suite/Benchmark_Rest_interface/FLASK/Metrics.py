#!/usr/bin/env python
# ARTIST Rest Interface for benchmark results visualization
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

import _mysql

def Get(CloudProvider,User,InstanceType,tool,Workload,Platform):

    mydb = _mysql.connect(host='127.0.0.1',user='root',passwd='test',db='cloudbench')
    
    #query filtered - 4 field 
    #query = 'SELECT * from test.'+ tool+ " where CloudProvider='"+CloudProvider+"' and InstanceType='" +InstanceType+"' and Workload='"+Workload+"' and Platform='"+Platform+"' "
    #http://127.0.0.1:5000/benchmarking/rest/results/Filebench?provider=Amazon&&type=m1.small&&workload=Varmail&&platform=redhat    
    
    #query all rows
    query = 'SELECT * from cloudbench.'+ tool
    #http://127.0.0.1:5000/benchmarking/rest/results/Filebench
    
    print "Executing: {0}".format(query)
    mydb.query(query)
    r=mydb.store_result()
    res = list(r.fetch_row(maxrows=0, how=1))
    mydb.close()
    return res

 
