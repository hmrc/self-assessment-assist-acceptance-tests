#!/usr/bin/env bash

BROWSER=${1:-remote-chrome}
JOURNEY=${2:-SelfAssessmentAssist- LOCAL TESTING}

RUNNER="uk.gov.hmrc.integration.cucumber.utils.runners.SaAssistApi.SelfAssessmentAssistAPI.SelfAssessmentTestRunner"

echo "Running tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Journey:              ${JOURNEY}"
echo "=========================================="
sbt -Dbrowser=${BROWSER} -Denvironment=local "testOnly ${RUNNER}"


