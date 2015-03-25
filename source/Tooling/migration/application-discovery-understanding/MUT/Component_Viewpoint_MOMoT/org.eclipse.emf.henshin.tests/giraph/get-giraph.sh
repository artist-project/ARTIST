#!/bin/bash

cd ~
git clone https://github.com/apache/giraph.git giraph
cd giraph
mvn clean package -DskipTests
