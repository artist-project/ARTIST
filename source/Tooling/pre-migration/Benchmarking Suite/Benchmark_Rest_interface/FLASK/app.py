#!/usr/bin/env python
# ARTIST Rest Interface for benchmark results visualization
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


from Metrics import Get
from flask import Flask, jsonify, render_template, request
import json, urllib

app = Flask(__name__)

@app.route('/benchmarking/ui/<tool>')
def index(tool):
    #return 'hello'
    return render_template('index.html', tool=tool)

@app.route('/benchmarking/ui/')
def index_menu():
    #return 'hello'
    return render_template('menu.html')

#app.route('/<CloudProvider>/<User>/<InstanceType>/<Tool>/<Workload>/<Platform>',methods=['GET'])
@app.route('/benchmarking/rest/results/<tool>',methods=['GET'])
def Metric(tool):
    
    #ALL ROWS 
    res = Get("","","",tool,"","")
    res2 = {"num_records": len(res), "data": res}
    return jsonify(res2);

    
    #filtered case - CASE OF 4 FILTERS - TO MODEL WITH QUERY IN METRICS FILE
    #provider = request.args.get('provider')
    #type = request.args.get('type')
    #workload = request.args.get('workload')
    #platform = request.args.get('platform')
    
    #res = Get(provider,"",type,tool,workload,platform)
    #res2 = {"num_records": len(res), "results": res}
    #return jsonify(res2);
    
if __name__ == '__main__':
    app.run(host='0.0.0.0')





