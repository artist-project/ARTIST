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

"""Openstack Cloud Provider

"""

from eu.artist.benchmarking.cloudproviders.common import CloudProviderBase
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

class OpenStackProvider(CloudProviderBase):
    def initialize(self):
        OpenStack = get_driver(Provider.OPENSTACK)
        self.__conn=OpenStack(self.access_id,self.secret_key,
                              ex_force_auth_url='http://8.21.28.222:5000/v2.0/tokens',
                              ex_force_auth_version='2.0_password',
                              ex_tenant_name='facebook853050102',
                              ex_tenant_id='3af07bd87fdd4845bdbe93ca49a0a255')
    
    def create_target_environment(self):
        
        size = NodeSize(id=self.size_id, name="", ram=None, disk=None, bandwidth=None, price=None, driver="")
        image = NodeImage(id=self.image_id, name="", driver="")
        self.__instance_name = "Benchmark_" + ''.join(random.choice(string.ascii_uppercase + string.digits) for _ in range(6))
        self.__node = self.__conn.create_node (name=self.__instance_name,
                         image=image,
                         driver=self.__conn,
                         ssh_username=self.vm_user,
                         size=size,
                         ssh_key=self.key_path,
                         ex_keyname=self.key_name,
                         ex_securitygroup='default'
                         )
        time.sleep(100)
        # get the first pool - public by default
        pool = self.__conn.ex_list_floating_ip_pools()[0]
        #create an ip in the pool
        floating_ip = pool.create_floating_ip()
        #print floating_ip.ip_address
        # get the node, note: change the node id to the some id you have
        node_flo = self.__conn.ex_get_node_details(self.__node.id)
        time.sleep(60)
        # attach the ip to the node
        self.__conn.ex_attach_floating_ip_to_node(node_flo, floating_ip)
        time.sleep(60)
        install_key= SSHKeyDeployment(open(os.path.expanduser(self.key_path)).read())
        msd=MultiStepDeployment([install_key])        
        
        logger.info("Instance {0} created with ip {1}".format(self.__instance_name, 
                                                              floating_ip.ip_address))
        #self.__conn.ex_detach_floating_ip_from_node(node_flo, floating_ip)
        # delete the ip
        #floating_ip.delete()
        self.__target_env_ip = floating_ip.ip_address
    
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
