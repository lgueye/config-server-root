package io.agileinfra.configserver.configbackend.client;

import io.agileinfra.configserver.rest.configuration.RestConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@Configuration
@Import(RestConfiguration.class)
public class ConfigBackendClientConfiguration {

  @Bean
  public ConfigBackendClient configBackendClient(@Value("${config.backend.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigBackendClient(apiUrl, restTemplate);
  }
}
