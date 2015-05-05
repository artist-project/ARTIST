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

"""Model for benchmark definition scripts.

Check the benchmarks_folder for further information
"""

import os
import re
import sys
import logging
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

DEFAULT_INSTALL_REDHAT = '''
sudo wget http://etics.res.eng.it/repository/pm/registered/repomd/global/artist/centos6.5_x86_64_gcc447/etics-registered-artist.repo -O /etc/yum.repos.d/artist.repo;
sudo yum -y install %(required_packages)s
'''

DEFAULT_POSTINSTALL_REDHAT = '''
echo Nothing to execute
'''

DEFAULT_INSTALL_DEBIAN = '''
sudo wget http://etics.res.eng.it/repository/pm/registered/apt/global/artist/deb7.4_x86_64_gcc472-5/etics-registered-artist.list -O /etc/apt/sources.list.d/Artist.list
sudo apt-get update;
sudo apt-get -y --force-yes install %(required_packages)s
'''

DEFAULT_POSTINSTALL_DEBIAN = '''
echo Nothing to execute
'''


class BenchmarkTest(object):

    execution_id = None
    '''assigned by the controller at submission time'''

    benchmark_name = None
    workload_name = None


    def __init__(self, benchmark_name, workload_name):
        self.benchmark_name = benchmark_name
        self.workload_name = workload_name
        
    def parse_results(self, results, cp):
        return self.parser.parse_results(results, cp, self)

    def get_install_script(self, platform, interpolation_dict = {}):
        return self.__get_script('install', platform, interpolation_dict)

    def get_postinstall_script(self, platform, interpolation_dict = {}):
        return self.__get_script('postinstall', platform, interpolation_dict)

    def get_execute_script(self, platform, interpolation_dict = {}):
        return self.__get_script('execute', platform, interpolation_dict)

    def get_remove_script(self, platform, interpolation_dict = {}):
        return self.__get_script('remove', platform, interpolation_dict)

    def __get_script(self, type, platform, interpolation_dict):
        if getattr(self, type + '_' + platform, None):
            return self.__replace_cp_properties(
                getattr(self, type + '_' + platform), interpolation_dict)

        if getattr(self, type, None):
            return self.__replace_cp_properties(
                getattr(self, type, None), interpolation_dict)

        default = getattr(sys.modules[__name__],
                          'DEFAULT_' + type.upper() + '_' + platform.upper())
        return self.__replace_cp_properties(
            default % self.__dict__, interpolation_dict)

    def __replace_cp_properties(self, string, interpolation_dict):

        for occ in re.findall('\$\$.*\$\$', string):
            if interpolation_dict.has_key(occ[2:-2]):
                string = string.replace(occ, interpolation_dict[occ[2:-2]])

        return string


class BenchmarkFactory:

    def __init__(self, config_folder):
        self.config_folder = config_folder

    def get_all_benchmark_tests(self, benchmark_name=None):
        pass

    def get_benchmark_test(self, benchmark_name, workload_name=None):
        ''' Insert the information related to the benchmark tool and workload to use; For example "filebench" and "Workload1"'''
        try:
            config_file = os.path.join(self.config_folder,
                                       benchmark_name + ".conf")

            config = SafeConfigParser()
            config.read(config_file)

            if not config.has_section(workload_name):
                raise Exception('benchmark configuration does not '
                                'contain a section for workload {0}'.format(
                    workload_name))

            instance = BenchmarkTest(benchmark_name, workload_name)
            for k, v in config.items('DEFAULT'):
                setattr(instance, k, v)

            for k, v in config.items(workload_name):
                setattr(instance, k, v)


            #set the parser
            parser_class = config.get('DEFAULT', 'parser_class')

            module_name, class_name = parser_class.rsplit('.', 1)

            __import__(module_name)
            module = sys.modules[module_name]
            clazz = getattr(module, class_name)
            instance.parser = clazz()

            return instance

        except Exception, ex:
            logger.error("Error loading benchmark test: {0}".format(ex))
            return None
