package io.agileinfra.configserver.e2e;

import io.agileinfra.configserver.client.ConfigServerClientConfiguration;
import io.agileinfra.configserver.configbackend.client.ConfigBackendClientConfiguration;
import io.agileinfra.configserver.consumer.client.ConfigServerConsumerClientConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Slf4j
@Configuration
@Import({ ConfigBackendClientConfiguration.class, ConfigServerClientConfiguration.class, ConfigServerConsumerClientConfiguration.class })
public class E2EConfigServerCucumberTestConfiguration {}
