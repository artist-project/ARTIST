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

"""Provides examples for using the benchmark controller
"""

import logging
import re
import random
import string
from eu.artist.benchmarking.cloudproviders.common import CloudProviderFactory
from eu.artist.benchmarking.benchmark import BenchmarkFactory

__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"

if __name__ == '__main__':
    
    logging.basicConfig(level=logging.DEBUG)
    factory = CloudProviderFactory('../cloud_providers')
    bf = BenchmarkFactory('../benchmarks_folder')
    
    # In this section insert the information related to the provider and flavour to use; 
    # For example 'Amazon' and 'redhat-large'
    cp = factory.get_cloud_provider('example','small-debian')
   
    # In this section insert the information related to the benchmark tool and workload to use 
    # For example 'filebench' and 'Workload1'
    bt = bf.get_benchmark_test('example', 'WorkloadA')

    # Initialize the driver useful to the connection
    cp.initialize()
    
    # Create the instance on the provider infrastructure 
    # This step can be skipped if already in possession of an IP address (step below)
    # In such case comment this line
    cp.create_target_environment()
    
    # Skip this line if the creation of a new instance is needed 
    cp.set_target_environment('Insert IP address')
    
    # Install the benchmark tool on the created instance
    cp.install_benchmark(bt)
    
     # Execute the benchmark tool on the created instance
    cp.execute_benchmark(bt)
    
    # Both Installation and Execution phases
    # If used, comment the two previous lines
    cp.run_benchmark(bt)
    
    # Terminate the created instance
    cp.destroy_target_environment()

    
