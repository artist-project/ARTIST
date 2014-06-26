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

__author__ = "Nunzio Andrea Galante, Gabriele Giammatteo"
__copyright__ = "Copyright 2014 Engineering Ingegneria Informatica S.p.A."
__credits__ = ["Nunzio Andrea Galante", "Gabriele Giammatteo"]
__license__ = "Apache License, Version 2.0"
__version__ = "1.0.0"
__maintainer__ = "Nunzio Andrea Galante"
__email__ = "nunzioandrea.galante@eng.it"
__status__ = "Prototype"


from distutils.core import setup
from os import listdir
from os.path import isfile, join

benchmarks_files = [ join('benchmarks_folder', f) for f in listdir('benchmarks_folder') if isfile(join('benchmarks_folder', f)) ]
cloudproviders_files = [ join('cloud_providers', f) for f in listdir('cloud_providers') if isfile(join('cloud_providers', f)) ]


setup(name='BenchmarkingController',
      version='1.0.0',
      description='ARTIST Benchmarking Controller',
      author='Nunzio Andrea Galante, Gabriele Giammatteo',
      author_email='nunzioandrea.galante@eng.it',
      url='https://github.com/artist-project/ARTIST/tree/master/source/Tooling/pre-migration/benchmarking%20controller',

      packages=['eu', 'eu.artist', 'eu.artist.benchmarking', 'eu.artist.benchmarking.cloudproviders', 'eu.artist.benchmarking.parsers'],
      package_dir = {'': 'src'},

      package_data={'': ['benchmarks_folder/*.conf', 'cloud_providers/*.conf']},
      data_files=[('share/benchmarking_controller/benchmarks', benchmarks_files),
          ('share/benchmarking_controller/cloudproviders', cloudproviders_files)]
     )