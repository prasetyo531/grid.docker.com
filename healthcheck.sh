#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER
# MODULE

echo "checking if hub is ready - $hub_host "

while [ "$( curl -s http://$hub_host:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	echo ulang lagi.
	sleep 1
done

if [ "$( curl -s http://$hub_host:4444/wd/hub/status | jq -r .value.ready )" == "true" ]
then
	echo node ready.
fi

#start java command
java -cp grid.docker.com-1.0.0.jar:grid.docker.com-1.0.0-tests.jar:libs/* -Dbrowser=$browser -Dhub_host=$hub_host org.testng.TestNG $module