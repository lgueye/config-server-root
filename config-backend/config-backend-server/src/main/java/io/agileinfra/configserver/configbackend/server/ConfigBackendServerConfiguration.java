package io.agileinfra.configserver.configbackend.server;

import io.agileinfra.configserver.configbackend.server.persistence.PersistenceConfiguration;
import io.agileinfra.configserver.configbackend.server.persistence.StagingConfigurationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceConfiguration.class)
public class ConfigBackendServerConfiguration {

  @Bean
  ConfigurationRequestProcessor stagingConfigurationRequestProcessor(final StagingConfigurationRepository stagingConfigurationRepository) {
    return new StagingConfigurationRequestProcessor(stagingConfigurationRepository);
  }
}
