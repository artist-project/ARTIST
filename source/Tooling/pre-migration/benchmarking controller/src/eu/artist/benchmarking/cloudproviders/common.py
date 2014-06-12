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

"""Provides common classes for modelling and managing cloud providers

"""

import os
import sys
import logging
from tempfile import NamedTemporaryFile
import paramiko
from ConfigParser import SafeConfigParser

__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"



logger = logging.getLogger(__name__)


class CloudProviderInterface:

    def initialize(self):
        '''
        called when class is istantiated; Initialize the driver useful to the connection
        '''
        pass


    def create_target_environment(self):
        '''output is the ip addresses of vm machines created; Create the instance on the provider infrastructure 
        This step can be skipped if already in possession of an IP address'''

        logger.error("Method create_target_environment must be implemented")
        pass

    def set_target_environment(self, ip_addr):
        ''' Skip this line if the creation of a new instance is needed '''
        logger.error("Method set_target_environment must be implemented")
        pass

    def install_benchmark(self, benchmark):
        '''Install the benchmark tool on the created instance'''
        logger.error("Method install_benchmarks must be implemented")
        pass

    def execute_benchmark(self, benchmark):
        '''Execute the benchmark tool on the created instance'''
        logger.error("Method execute_benchmarks must be implemented")
        pass

    def run_benchmark(self, benchmark):
        '''Both Installation and Execution phases'''
        logger.error("Method run_benchmarks must be implemented")
        pass


    def destroy_target_environment(self):
        '''Terminate the created instance'''
        logger.error("Method destroy_target_environment must be implemented")
        pass



class CloudProviderBase(CloudProviderInterface):
    
    node_id = None

    def run_benchmarks(self, benchmarks):
        for b in benchmarks:
            self.run_benchmark(b)
 
    def run_benchmark(self, benchmark):
        self.install_benchmark(benchmark)
        self.execute_benchmark(benchmark)
        
    def _execute_script(self, script, ip_addr, user, key_path, deploy_loc):
        
        logger.debug("Executing script: {0}".format(script))
        
        #copy the script in a temp file
        local_script = NamedTemporaryFile(delete=False)
        local_script.write(script)
        local_script.close()
        
        ssh=paramiko.SSHClient()
        ssh.load_system_host_keys()
        ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())        
        ssh.connect(ip_addr, port=22, username=user, 
                    key_filename=key_path,timeout=300)
        
        #put script on the vm
        sftpclient = ssh.open_sftp()
        remote_path = os.path.join(deploy_loc, 'script.sh')
        sftpclient.put(local_script.name, remote_path)
        sftpclient.close()
        
        #execute the script
        command = 'chmod +x {0}; {0}'.format(remote_path)
        stdin,stdout,stderr = ssh.exec_command(command)
        
        stdout_s = stdout.read()
        stderr_s = stderr.read()
        
        logger.debug("Script execution stdout is: {0}".format(stdout_s))
        logger.debug("Script execution stderr is: {0}".format(stderr_s))
        
        ssh.close()
        os.unlink(local_script.name)
        
        return stdout_s, stderr_s


class CloudProviderFactory:

    def __init__(self, config_folder):
        self.config_folder = config_folder



    def get_cloud_provider(self, name, flavour):
        '''a configuration file called <name>.conf is required in config folder.
        Insert the information related to the provider and flavour to use;
        For example "Amazon" and "redhat-large"
        '''

        try:
            config_file = os.path.join(self.config_folder, name + ".conf")

            config = SafeConfigParser()
            config.read(config_file)

            cp_class = config.get(flavour, 'cp_class')

            module_name, class_name = cp_class.rsplit('.', 1)

            __import__(module_name)
            module = sys.modules[module_name]
            clazz = getattr(module, class_name)


            logger.info('Instantiating cloud provider class {0}'.
                        format(cp_class))
            instance = clazz()
            setattr(instance, 'name', name)
            for k, v in config.items(flavour):
                setattr(instance, k, v)


            return instance

        except Exception, ex:
            logger.error("Error loading cloud provider: {0}".format(ex))
            return None
