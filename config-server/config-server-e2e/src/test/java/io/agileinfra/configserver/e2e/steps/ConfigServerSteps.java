package io.agileinfra.configserver.e2e.steps;

import io.agileinfra.configserver.client.ConfigServerClient;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ConfigServerSteps {

  private final ConfigServerClient configServerClient;

  @When("consumers refresh their configuration")
  public void consumers_refresh_their_configuration() {}
}
