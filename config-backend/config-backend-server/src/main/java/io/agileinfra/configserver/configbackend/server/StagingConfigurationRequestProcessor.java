package io.agileinfra.configserver.configbackend.server;

import io.agileinfra.configserver.configbackend.model.ConfigurationRequest;
import io.agileinfra.configserver.configbackend.server.persistence.StagingConfiguration;
import io.agileinfra.configserver.configbackend.server.persistence.StagingConfigurationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@RequiredArgsConstructor
public class StagingConfigurationRequestProcessor implements ConfigurationRequestProcessor {

  private final StagingConfigurationRepository repository;

  @Override
  public boolean accept(ConfigurationRequest request) {
    return (
      request != null &&
      request.getEnv().equalsIgnoreCase("staging") &&
      StringUtils.isEmpty(request.getApplication()) &&
      StringUtils.isNotEmpty(request.getKey()) &&
      StringUtils.isNotEmpty(request.getValue())
    );
  }

  @Override
  public void process(ConfigurationRequest request) {
    final StagingConfiguration entity = StagingConfiguration.builder().key(request.getKey()).value(request.getValue()).build();
    repository.save(entity);
  }
}
