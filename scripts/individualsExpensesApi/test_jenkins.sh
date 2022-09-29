#!/bin/bash

curl -X GET http://localhost:9772/setup/reset
cd ../..
sbt -Dbrowser=remote-chrome -Denv=local -Dzap.proxy=true 'testOnly *runners.IndividualsExpensesApi.TestRunner'