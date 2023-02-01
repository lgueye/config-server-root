package io.agileinfra.configserver.e2e.steps;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationRequest {

  private String env;
  private String application;
  private String key;
  private String value;
}
