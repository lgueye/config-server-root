package io.agileinfra.configserver.configserver.e2e;

import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
public class E2EConfigServerCucumberIT {}
