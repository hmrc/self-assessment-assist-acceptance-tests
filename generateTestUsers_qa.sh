#!/bin/bash

sbt -Denv=qa -Dbrowser=headless-chrome 'testOnly uk.gov.hmrc.integration.cucumber.utils.runners.GenerateTestUsersQA'