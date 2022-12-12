#!/usr/bin/env bash

BROWSER=${1:-chrome}
JOURNEY=${2:-SelfAssessmentAssist- LOCAL TESTING}

RUNNER="SelfAssessmentTestRunner"

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Journey:              ${JOURNEY}"
echo "=========================================="
sbt -Dbrowser=${BROWSER} "testOnly uk.gov.hmrc.integration.cucumber.utils.runners.SaAssistApi.SelfAssessmentAssistAPI.SelfAssessmentTestRunner"


