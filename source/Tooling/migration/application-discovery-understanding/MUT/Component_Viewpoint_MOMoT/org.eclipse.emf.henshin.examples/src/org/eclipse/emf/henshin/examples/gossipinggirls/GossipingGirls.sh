#!/bin/sh

# ECLIPSE_HOME:
if [ -d "$HOME/eclipse" ]; then
    ECLIPSE_HOME="$HOME/eclipse"
elif [ -d "$HOME/opt/eclipse" ]; then
    ECLIPSE_HOME="$HOME/opt/eclipse"
elif [ -d "/usr/local/eclipse" ]; then
    ECLIPSE_HOME="/usr/local/eclipse"
else
    ECLIPSE_HOME="/opt/eclipse"
fi

# WORKSPACE:
WORKSPACE=`cd ../../../../../../../..; pwd`

# MAX_MEMORY:
TOTAL_MEM=`free | grep Mem | awk '{print $2}'`
TOTAL_MEM=$(($TOTAL_MEM / 1024))
if [ "$TOTAL_MEM" -gt "2048" ]; then
    MAX_MEMORY="$(($TOTAL_MEM - 768))M"
else
    MAX_MEMORY="$(($TOTAL_MEM - 384))M"
fi

echo "ECLIPSE_HOME : $ECLIPSE_HOME"
echo "WORKSPACE    : $WORKSPACE"
echo "MAX_MEMORY   : $MAX_MEMORY"

DEPS="org.eclipse.core.contenttype
org.eclipse.core.jobs
org.eclipse.core.resources
org.eclipse.core.runtime
org.eclipse.osgi
org.eclipse.equinox.common
org.eclipse.equinox.registry
org.eclipse.equinox.preferences
org.eclipse.equinox.app
org.eclipse.emf.ecore
org.eclipse.emf.common
org.eclipse.emf.ecore.xmi
org.eclipse.emf.codegen.ecore
org.eclipse.emf.codegen
org.eclipse.emf.ecore.change
org.eclipse.ocl
lpg.runtime.java
org.eclipse.ocl.ecore"

HENSHIN="org.eclipse.emf.henshin.model
org.eclipse.emf.henshin.examples
org.eclipse.emf.henshin.interpreter
org.eclipse.emf.henshin.statespace
org.eclipse.emf.henshin.statespace.ocl"

# Classpath:
CP=""
for dep in $DEPS; do
  NEXT=`ls $ECLIPSE_HOME/plugins/$dep*.jar | head -1`
  CP="$CP:$NEXT"
done
for hen in $HENSHIN; do
  NEXT="$WORKSPACE/$hen/bin"
  CP="$CP:$NEXT"
done

sync
cd $WORKSPACE/org.eclipse.emf.henshin.examples
java -Xms$MAX_MEMORY -Xmx$MAX_MEMORY -Dfile.encoding=UTF-8 -classpath $CP org.eclipse.emf.henshin.examples.gossipinggirls.GossipingGirls
cd - > /dev/null
