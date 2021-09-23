#!/bin/bash
set -eux
mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="src\test\resources\example\cucumber --glue example.cucumber"
