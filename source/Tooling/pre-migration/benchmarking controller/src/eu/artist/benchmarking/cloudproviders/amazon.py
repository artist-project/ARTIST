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

"""Amazon EC2 Cloud Provider

"""

import logging
from libcloud.compute.types import Provider
from libcloud.compute.providers import get_driver
from libcloud.compute.base import NodeSize, NodeImage
from libcloud.compute.deployment import ScriptDeployment, SSHKeyDeployment, MultiStepDeployment
import paramiko
import MySQLdb
import string
import random
import os
import sys
import ConfigParser
import time
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

class AmazonProvider(CloudProviderBase):

    def initialize(self):
        driver=get_driver(Provider.EC2)
        self.__conn=driver(self.access_id,self.secret_key)

    def create_target_environment(self):
        size=NodeSize(id=self.size_id, name="", ram=None, disk=None, 
                      bandwidth=None, price=None, driver="")
        image=NodeImage(id=self.image_id, name="", driver="")
        install_key= SSHKeyDeployment(open(os.path.expanduser(self.key_path)).read())
        msd=MultiStepDeployment([install_key])
        self.__instance_name = "Benchmark_" + ''.join(random.choice(string.ascii_uppercase + string.digits) for _ in range(6))
        self.__node = self.__conn.deploy_node(name=self.__instance_name,
                            image=image,
                            size=size,
                            deploy=msd,
                            ssh_username=self.vm_user,
                            ssh_key=self.key_path,
                            ex_keyname=self.key_name)
        logger.info("Instance {0} created with ip {1}".format(self.__instance_name, 
                                                              self.__node.public_ips[0]))
        self.__target_env_ip = self.__node.public_ips[0]


    def set_target_environment(self, ip_addr):
        self.__target_env_ip = ip_addr
    

    def install_benchmark(self,benchmark):
        stdout,stderr = self._execute_script(
            benchmark.get_install_script(self.platform, self.__dict__),
            self.__target_env_ip,
            self.vm_user,
            self.key_path,
            self.script_deploy_location)

        stdout,stderr = self._execute_script(
            benchmark.get_postinstall_script(self.platform, self.__dict__),
            self.__target_env_ip,
            self.vm_user,
            self.key_path,
            self.script_deploy_location)


    def execute_benchmark(self, benchmark):
        stdout,stderr = self._execute_script(
                benchmark.get_execute_script(self.platform, self.__dict__),
                self.__target_env_ip,
                self.vm_user,
                self.key_path,
                self.script_deploy_location)
        retrive_script = "cat {0}".format(self.output_file)
        stdout,stderr = self._execute_script(
                retrive_script,
                self.__target_env_ip,
                self.vm_user,
                self.key_path,
                self.script_deploy_location)
        data = benchmark.parse_results(stdout, self)
         
    def destroy_target_environment(self):
        nodes=self.__conn.list_nodes()
        for node in nodes:
            if node.name == self.__instance_name:
                self.__conn.destroy_node(node)
                logger.info("Instance {0} destroyed".format(self.__instance_name))
