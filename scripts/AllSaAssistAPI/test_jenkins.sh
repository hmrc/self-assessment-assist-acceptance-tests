#!/bin/bash

curl -X POST http://localhost:8242/individuals/self-assessment/assist/reports
cd ../..
sbt -Dbrowser=remote-chrome -Denv=local -Dzap.proxy=true 'testOnly *runners.SaAssistApi.TestRunner'