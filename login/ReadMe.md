

[![Build Status](https://travis-ci.org/splurgeop/modelbasedtesting.svg?branch=master)](https://travis-ci.org/splurgeop/modelbasedtesting)



### Installation

modelbased testing requires [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) v8+ to run.

[maven]

[graphwalker-cli]

[webdrivermanager]

[selenium-java/standalone-server] binding
[junit]

Install the dependencies and devDependencies and start the server.

```cmd
> mvn clean
> mvn graphwalker:generate-sources
> mvn install
> mvn graphwalker:test
