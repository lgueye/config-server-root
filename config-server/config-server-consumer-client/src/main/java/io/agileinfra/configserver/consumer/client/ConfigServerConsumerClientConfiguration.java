package io.agileinfra.configserver.consumer.client;

import io.agileinfra.configserver.rest.configuration.RestConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@Configuration
@Import(RestConfiguration.class)
public class ConfigServerConsumerClientConfiguration {

  @Bean
  public ConfigServerConsumerClient serviceAClient(@Value("${servicea.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigServerConsumerClient(apiUrl, restTemplate);
  }

  @Bean
  public ConfigServerConsumerClient serviceBClient(@Value("${serviceb.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigServerConsumerClient(apiUrl, restTemplate);
  }

  @Bean
  public ConfigServerConsumerClient serviceCClient(@Value("${servicec.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigServerConsumerClient(apiUrl, restTemplate);
  }

  @Bean
  public ConfigServerConsumerClient serviceDClient(@Value("${serviced.server.api.url}") String apiUrl, final RestTemplate restTemplate) {
    return new ConfigServerConsumerClient(apiUrl, restTemplate);
  }
}
