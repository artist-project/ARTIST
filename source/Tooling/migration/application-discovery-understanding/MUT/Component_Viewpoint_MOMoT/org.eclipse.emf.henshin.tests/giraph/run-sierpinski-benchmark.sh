#!/bin/bash

if [ ! -f tests.conf ]; then
    echo "tests.conf not found."
    exit 1
fi
source tests.conf

HADOOP_COMMAND=$HADOOP_HOME/bin/hadoop

function copy_tests {
	sftp $SSH_ARGS $HADOOP_MASTER << EOF
		mkdir $WORKING_DIR
		rm $WORKING_DIR/*
		cd $WORKING_DIR
		lcd graphs
		put *.json
		lcd ../classes
		cd $GIRAPH_TESTS_DIR
		put *.java
EOF
}

function compile_tests {
	ssh $SSH_ARGS $HADOOP_MASTER << EOF
		cd $GIRAPH_HOME/$GIRAPH_PROJECT
		mvn install -DskipTests
EOF
	if [ $? -ne 0 ]; then
        echo "Build failed."
        exit 1
    else
        echo "Build successful."
    fi
}

function run_benchmark {
    main="$GIRAPH_TESTS_PACKAGE.$1\\\$"
    util="$GIRAPH_TESTS_PACKAGE.HenshinUtil\\\$"
	ssh $SSH_ARGS $HADOOP_MASTER << EOF 2>&1 | tee /tmp/output.log
		cd $WORKING_DIR && \
		$HADOOP_COMMAND fs -rmr /testInput ; \
		$HADOOP_COMMAND fs -rmr /testOutput ; \
		$HADOOP_COMMAND fs -mkdir /testInput ; \
		$HADOOP_COMMAND fs -put $2.json /testInput/ ; \
		$HADOOP_COMMAND jar \
			$GIRAPH_TESTS_JAR \
			org.apache.giraph.GiraphRunner \
			$GIRAPH_TESTS_PACKAGE.$1 \
			-vif "$util""InputFormat" \
			-vip /testInput/$2.json \
			-of "$util""OutputFormat" \
			-op /testOutput \
			-w $3 \
			-mc "$main""MasterCompute"
EOF
	cat /tmp/output.log | grep "Superstep " | sed "s/^.*Superstep.//" | sed "s/..milliseconds../ /" | /bin/sort -g > $4
	rm /tmp/output.log
}


if [ $# -ne 1 ]; then
  echo usage $0 LEVEL
  exit 1
fi

LEVEL=$1
MICROSTEPS=4
RUNS=1

echo

copy_tests
compile_tests

for workers in $(seq 5 6); do
    workers="$(( 14 - ($workers * 2) ))"
    phpcom="php -f average-times.php $MICROSTEPS";
    for run in $(seq 1 $RUNS); do
	echo
	echo "Starting run $run / $RUNS with $workers workers..."
	echo
	run_benchmark SierpinskiMain$LEVEL Sierpinski $workers run${run}.txt
	phpcom="$phpcom run${run}.txt"
    done
    echo
    echo "Finished $RUNS runs."
    echo
    $phpcom > benchmarks/sierpinski-${LEVEL}-${workers}.txt
    rm run*.txt
done
