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

"""Parser for DataCaching results
"""

import logging
import datetime
import database
import time


__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"



logger = logging.getLogger(__name__)

ts = time.time()
st = datetime.datetime.fromtimestamp(ts).strftime('%Y-%m-%d %H:%M:%S')

class CloudSuiteParser(object):
    def parse_results(self, results, cp, benchmark):
            data = self.__workload_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],
                              data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],
                              data[18],None,None,None,None,None,None,None,None,None,None,None,None,None)

    def __workload_parser(self, results):
            h = results
            lines=[x.split() for x in h.splitlines()]
            a= lines[59][0].replace(',','')
            print a
            b= lines[59][1].replace(',','')
            print b
            c= lines[59][2].replace(',','')
            print c
            d= lines[59][3].replace(',','')
            print d
            e= lines[59][4].replace(',','')
            print e
            f= lines[59][5].replace(',','')
            print f
            g= lines[59][6].replace(',','')
            print g
            pop= lines[59][7].replace(',','')
            print pop
            i= lines[59][8].replace(',','')
            print i
            l= lines[59][9].replace(',','')
            print l
            m= lines[59][10].replace(',','')
            print m
            n= lines[59][11].replace(',','')
            print n
            o= lines[59][12].replace(',','')
            print o
            p= lines[59][13].replace(',','')
            print p
            q= lines[59][14].replace(',','')
            print q
            r= lines[13][1]
            print r
            s= '200'
            print s
            t= lines[13][3]
            print t
            u='10000'
            print u
    
            return a,b,c,d,e,f,g,pop,i,l,m,n,o,p,q,r,s,t,u