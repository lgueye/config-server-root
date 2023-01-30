package io.agileinfra.configserver.client;

import io.agileinfra.configserver.rest.configuration.RestConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@Configuration
@Import(RestConfiguration.class)
public class ConfigServerClientConfiguration {

  @Bean
  public ConfigServerClient configServerClient(@Value("${config.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigServerClient(apiUrl, restTemplate);
  }
}
