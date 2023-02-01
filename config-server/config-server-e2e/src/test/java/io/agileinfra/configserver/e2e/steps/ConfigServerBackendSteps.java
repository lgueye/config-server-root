package io.agileinfra.configserver.e2e.steps;

import io.agileinfra.configserver.configbackend.client.ConfigBackendClient;
import io.agileinfra.configserver.configbackend.model.ConfigurationRequest;
import io.agileinfra.configserver.e2e.E2EConfigServerCucumberTestConfiguration;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Map;

@CucumberContextConfiguration
@ContextConfiguration(classes = { E2EConfigServerCucumberTestConfiguration.class })
@TestPropertySource(value = { "classpath:application-test.properties" })
@RequiredArgsConstructor
@Slf4j
public class ConfigServerBackendSteps {

  private final ConfigBackendClient configBackendClient;

  @DataTableType
  public ConfigurationRequest configurationRequestTransformer(Map<String, String> entry) {
    return ConfigurationRequest
      .builder()
      .env(entry.get("env"))
      .application(entry.get("application"))
      .key(entry.get("key"))
      .value(entry.get("value"))
      .build();
  }

  @Given("{string} configuration")
  public void configuration(String string, final List<ConfigurationRequest> configurationRequests) {
    configBackendClient.save(configurationRequests);
  }
}
