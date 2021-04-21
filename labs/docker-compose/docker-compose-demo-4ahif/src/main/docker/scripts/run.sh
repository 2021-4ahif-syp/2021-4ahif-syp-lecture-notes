#!/bin/bash

RUNNER=$(ls demo.jar)

echo "starting quarkus $RUNNER..."
java -Dquarkus.profile=docker -jar $RUNNER
