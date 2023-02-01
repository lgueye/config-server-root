package io.agileinfra.configserver.configbackend.server;

import io.agileinfra.configserver.configbackend.model.ConfigurationRequest;

public interface ConfigurationRequestProcessor {
  boolean accept(ConfigurationRequest request);

  void process(ConfigurationRequest request);
}
