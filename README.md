UI tests for LexisNexis
Coding language = Java 11'

Build tool = Maven

Test assertions: = JUnit

This is a Cucumber BDD framework.

To run all tests:
mvn test -Dcucumber.options="--tags @regression"

To run a particular test scenario:
Tag the scenario with @<tag name> and run:

mvn test -Dcucumber.options="--tags @<tag name>"

To view HTML Test reports:
Go to:

target/default-html-reports/index.html