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

"""Flexiant Cloud Provider

"""

import logging
import paramiko
from eu.artist.benchmarking.cloudproviders.common import CloudProviderBase


__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"



logger = logging.getLogger(__name__)

VERIFY_SSL_CERT= True
VERIFY_SSL_CERT_STRICT= True

class FlexiantProvider(CloudProviderBase):
    
    def set_target_environment(self, ip_addr):
        self.__target_env_ip = ip_addr
            
    def install_benchmark(self,benchmark):
        stdout,stderr = self._execute_script(
            benchmark.get_install_script(self.platform, self.__dict__),
            self.__target_env_ip,
            self.vm_user,
            None,
            self.script_deploy_location,password=self.password)

        stdout,stderr = self._execute_script(
            benchmark.get_postinstall_script(self.platform, self.__dict__),
            self.__target_env_ip,
            self.vm_user,
            None,
            self.script_deploy_location,password=self.password)


    def execute_benchmark(self, benchmark):
        stdout,stderr = self._execute_script(
                benchmark.get_execute_script(self.platform, self.__dict__),
                self.__target_env_ip,
                self.vm_user,
                 None,
                 self.script_deploy_location,password=self.password)
        retrive_script = "cat {0}".format(self.output_file)
        stdout,stderr = self._execute_script(
                retrive_script,
                self.__target_env_ip,
                self.vm_user,
                None,
                self.script_deploy_location,password=self.password)
        data = benchmark.parse_results(stdout, self)
         
    