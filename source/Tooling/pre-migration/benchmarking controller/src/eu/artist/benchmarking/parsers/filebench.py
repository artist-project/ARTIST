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

"""Parser for Filebench results
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

class FilebenchParser(object):

    def parse_results(self, results, cp, benchmark):
            data = self.__workload_parser(results)
            a = benchmark.workload_name
            #b = benchmark.tipology
            #wn = a + b
            database.database(st,cp.name,cp.vm_user,cp.size_id,benchmark.tool_name,benchmark.workload_name,cp.platform,
                              data[0],data[1],data[2],data[3],data[4],data[5],
                              None,None,None,None,None,None,None,None,None,
                              None,None,None,None,None,None,None,None,None,
                              None,None,None,None,None,None,None,None)
      
    def __workload_parser(self, results):
        h = results
        zz= re.findall('IO Summary.*',h)
        lines=[x.split() for x in zz]
        a = lines[0][2]
        print a
        b = lines[0][4]
        print b
        c = lines[0][6].replace('(','')
        print c
        d = lines[0][8].replace('mb/s,','')
        print d
        e = lines[0][9].replace('us','')
        print e
        f = lines[0][11].replace('ms','');
        print f
        
        return a,b,c,d,e,f                       