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

"""Parser for YCSB results
"""


import re
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

class YCSBParser(object):

    def parse_results(self, results, cp, benchmark):
        if benchmark.workload_name == 'workloada':
            #return self.__workloada_parser(results)
            #self.__workloada_parser(results)
            data = self.__workloada_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],
                              '---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---')
        if benchmark.workload_name == 'workloadb':
            data = self.__workloadb_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],
                              '---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---')
        if benchmark.workload_name == 'workloadc':
            data = self.__workloadc_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],'---','---','---','---','---','---',data[2],data[3],data[4],data[5],data[6],data[7],
                              '---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---','---')
        if benchmark.workload_name == 'workloadd':
            data = self.__workloadd_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],'---','---','---','---','---','---',data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],
                              '---','---','---','---','---','---','---','---','---','---','---','---')
        if benchmark.workload_name == 'workloade':
            data = self.__workloade_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],'---','---','---','---','---','---','---','---','---','---','---','---',data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],
                              '---','---','---','---','---','---')
        if benchmark.workload_name == 'workloadf':
            data = self.__workloadf_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],'---','---','---','---','---','---','---','---','---','---','---','---',
                              data[14],data[15],data[16],data[17],data[18],data[19])
    def __workloada_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        n= re.findall('\[UPDATE\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in n]
        c= lines[0][2]
        print c               
        m= re.findall('\[UPDATE\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in m]
        d= lines[0][2]
        print d                
        l= re.findall('\[UPDATE\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in l]
        e= lines[0][2]
        print e                
        t= re.findall('\[UPDATE\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in t]
        f= lines[0][2]
        print f                
        q= re.findall('\[UPDATE\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in q]
        g= lines[0][2]
        print g                
        v= re.findall('\[UPDATE\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in v]
        h1= lines[0][2]
        print h1
        a1= re.findall('\[READ\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a1]
        i= lines[0][2]
        print i                
        a2= re.findall('\[READ\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a2]
        l= lines[0][2]
        print l               
        a3= re.findall('\[READ\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a3]
        m= lines[0][2]
        print m                
        a4= re.findall('\[READ\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a4]
        n= lines[0][2]
        print n                
        a5= re.findall('\[READ\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a5]
        o= lines[0][2]
        print o                
        a6= re.findall('\[READ\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a6]
        p= lines[0][2]
        print p
        return a,b,c,d,e,f,g,h1,i,l,m,n,o,p                               
    def __workloadb_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        n= re.findall('\[UPDATE\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in n]
        c= lines[0][2]
        print c               
        m= re.findall('\[UPDATE\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in m]
        d= lines[0][2]
        print d                
        l= re.findall('\[UPDATE\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in l]
        e= lines[0][2]
        print e                
        t= re.findall('\[UPDATE\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in t]
        f= lines[0][2]
        print f                
        q= re.findall('\[UPDATE\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in q]
        g= lines[0][2]
        print g                
        v= re.findall('\[UPDATE\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in v]
        h1= lines[0][2]
        print h1
        a1= re.findall('\[READ\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a1]
        i= lines[0][2]
        print i                
        a2= re.findall('\[READ\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a2]
        l= lines[0][2]
        print l               
        a3= re.findall('\[READ\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a3]
        m= lines[0][2]
        print m                
        a4= re.findall('\[READ\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a4]
        n= lines[0][2]
        print n                
        a5= re.findall('\[READ\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a5]
        o= lines[0][2]
        print o                
        a6= re.findall('\[READ\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a6]
        p= lines[0][2]
        print p                               
        return a,b,c,d,e,f,g,h1,i,l,m,n,o,p                               
    def __workloadc_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        a10= re.findall('\[READ\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a10]
        i= lines[0][2]
        print i                
        a20= re.findall('\[READ\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a20]
        l= lines[0][2]
        print l               
        a30= re.findall('\[READ\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a30]
        m= lines[0][2]
        print m                
        a40= re.findall('\[READ\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a40]
        n= lines[0][2]
        print n                
        a50= re.findall('\[READ\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a50]
        o= lines[0][2]
        print o                
        a60= re.findall('\[READ\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a60]
        p= lines[0][2]
        print p
        return a,b,i,l,m,n,o,p                                   
    def __workloadd_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        n= re.findall('\[READ\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in n]
        i= lines[0][2]
        print i               
        m= re.findall('\[READ\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in m]
        l= lines[0][2]
        print l                
        klo= re.findall('\[READ\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in klo]
        m= lines[0][2]
        print m                
        t= re.findall('\[READ\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in t]
        n= lines[0][2]
        print n                
        q= re.findall('\[READ\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in q]
        o= lines[0][2]
        print o                
        v= re.findall('\[READ\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in v]
        p= lines[0][2]
        print p
        a1= re.findall('\[INSERT\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a1]
        q= lines[0][2]
        print q                
        a2= re.findall('\[INSERT\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a2]
        r= lines[0][2]
        print r               
        a3= re.findall('\[INSERT\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a3]
        s= lines[0][2]
        print s                
        a4= re.findall('\[INSERT\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a4]
        t= lines[0][2]
        print t                
        a5= re.findall('\[INSERT\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a5]
        u= lines[0][2]
        print u                
        a6= re.findall('\[INSERT\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a6]
        v= lines[0][2]
        print v                               
        return a,b,i,l,m,n,o,p,q,r,s,t,u,v                                                
    def __workloade_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        n= re.findall('\[INSERT\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in n]
        q= lines[0][2]
        print q               
        m= re.findall('\[INSERT\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in m]
        r= lines[0][2]
        print r                
        l= re.findall('\[INSERT\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in l]
        s= lines[0][2]
        print s                
        t= re.findall('\[INSERT\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in t]
        t= lines[0][2]
        print t                
        oko= re.findall('\[INSERT\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in oko]
        u= lines[0][2]
        print u                
        v= re.findall('\[INSERT\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in v]
        v= lines[0][2]
        print v
        a10= re.findall('\[SCAN\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a10]
        a1= lines[0][2]
        print a1                
        a20= re.findall('\[SCAN\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a20]
        a2= lines[0][2]
        print a2              
        a30= re.findall('\[SCAN\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a30]
        a3= lines[0][2]
        print a3                
        a40= re.findall('\[SCAN\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a40]
        a4= lines[0][2]
        print a4                
        a50= re.findall('\[SCAN\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a50]
        a5= lines[0][2]
        print a5                
        a60= re.findall('\[SCAN\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a60]
        a6= lines[0][2]
        print a6                               
        return a,b,q,r,s,t,u,v,a1,a2,a3,a4,a5,a6                                            
    def __workloadf_parser(self, results):
        h = results
        z= re.findall('\[OVERALL\], RunTime\(ms\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in z]
        a = lines[0][2]
        print a
        y= re.findall('\[OVERALL\], Throughput\(ops/sec\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in y]
        b= lines[0][2]
        print b
        a1= re.findall('\[UPDATE\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in a1]
        c= lines[0][2]
        print c                
        a2= re.findall('\[UPDATE\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a2]
        d= lines[0][2]
        print d               
        a3= re.findall('\[UPDATE\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a3]
        e= lines[0][2]
        print e                
        a4= re.findall('\[UPDATE\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in a4]
        f= lines[0][2]
        print f                
        a5= re.findall('\[UPDATE\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a5]
        g= lines[0][2]
        print g                
        a6= re.findall('\[UPDATE\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in a6]
        h1= lines[0][2]
        print h1
        n= re.findall('\[READ\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in n]
        i= lines[0][2]
        print i    
        a2= re.findall('\[READ\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in a2]
        l= lines[0][2]
        print l              
        yui= re.findall('\[READ\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in yui]
        m= lines[0][2]
        print m                
        t= re.findall('\[READ\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in t]
        n= lines[0][2]
        print n                
        q= re.findall('\[READ\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in q]
        o= lines[0][2]
        print o               
        v= re.findall('\[READ\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in v]
        p= lines[0][2]
        print p  
        b1= re.findall('\[READ-MODIFY-WRITE\], Operations,\s[0-9]+',h)
        lines=[x.split() for x in b1]
        a7= lines[0][2]
        print a7                
        b2= re.findall('\[READ-MODIFY-WRITE\], AverageLatency\(us\),\s[0-9]+\.[0-9]+?',h)
        lines=[x.split() for x in b2]
        a8= lines[0][2]
        print a8               
        b3= re.findall('\[READ-MODIFY-WRITE\], MinLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in b3]
        a9= lines[0][2]
        print a9                
        b4= re.findall('\[READ-MODIFY-WRITE\], MaxLatency\(us\),\s[0-9]+',h)
        lines=[x.split() for x in b4]
        a10= lines[0][2]
        print a10                
        b5= re.findall('\[READ-MODIFY-WRITE\], 95thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in b5]
        a11= lines[0][2]
        print a11                
        b6= re.findall('\[READ-MODIFY-WRITE\], 99thPercentileLatency\(ms\),\s[0-9]+',h)
        lines=[x.split() for x in b6]
        a12= lines[0][2]
        print a12  
        return a,b,c,d,e,f,g,h1,i,l,m,n,o,p,a7,a8,a9,a10,a11,a12                         