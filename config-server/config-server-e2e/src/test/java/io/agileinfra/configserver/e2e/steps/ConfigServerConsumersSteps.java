package io.agileinfra.configserver.e2e.steps;

import io.agileinfra.configserver.consumer.client.ConfigServerConsumerClient;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ConfigServerConsumersSteps {

  private final List<ConfigServerConsumerClient> consumerClients;

  @DataTableType
  public ConfigurationEntry configurationEntryTransformer(Map<String, String> entry) {
    return ConfigurationEntry.builder().application(entry.get("application")).key(entry.get("key")).value(entry.get("value")).build();
  }

  @Then("within {string}, consumers configuration")
  public void consumers_configuration(String durationAsString, final List<ConfigurationEntry> configurationEntries) {}
}
