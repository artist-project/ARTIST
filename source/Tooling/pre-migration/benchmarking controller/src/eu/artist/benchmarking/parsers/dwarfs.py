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

"""Parser for Dwarfs results
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

class DwarfsParser(object):

    def parse_results(self, results, cp, benchmark):
            data = self.__workload_parser(results)
            a = benchmark.workload_name
            b = benchmark.tipology
            wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,wn,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],
                              data[6],data[7],data[8],data[9],data[10],data[11],
                              None,None,None,None,None,None,None,None,None,None,
                              None,None,None,None,None,None,None,None,None,None)
           

    def __workload_parser(self, results):
        h = results
        a='1'
        z= re.findall('Structured Grid,\s[0-9]+',h)
        lines=[x.split() for x in z]
        b = lines[0][2]
        print b
        z= re.findall('MapReduce \(Monte Carlo\),\s[0-9]+',h)
        lines=[x.split() for x in z]
        c = lines[0][3]
        print c
        z= re.findall('Dense Matrix,\s[0-9]+',h)
        lines=[x.split() for x in z]
        d = lines[0][2]
        print d
        z= re.findall('Sparse Matrix,\s[0-9]+',h)
        lines=[x.split() for x in z]
        e = lines[0][2]
        print e
        z= re.findall('Graph Traversal,\s[0-9]+',h)
        lines=[x.split() for x in z]
        f = lines[0][2]
        print f
        z= re.findall('Particle,\s[0-9]+',h)
        lines=[x.split() for x in z]
        g = lines[0][1]
        print g
        z= re.findall('Spectral,\s[0-9]+',h)
        lines=[x.split() for x in z]
        h1 = lines[0][1]
        print h1
        z= re.findall('Livermore,\s[0-9]+',h)
        lines=[x.split() for x in z]
        i = lines[0][1]
        print i
        z= re.findall('Drystone,\s[0-9]+',h)
        lines=[x.split() for x in z]
        l = lines[0][1]
        print l
        z= re.findall('MemoryBDW,\s[0-9]+',h)
        lines=[x.split() for x in z]
        m = lines[0][1]
        print m
        z= re.findall('IOZONE,\s[0-9]+',h)
        lines=[x.split() for x in z]
        n = lines[0][1]
        print n

        return a,b,c,d,e,f,g,h1,i,l,m,n                       