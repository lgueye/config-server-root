package io.agileinfra.configserver.configbackend.model;

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
