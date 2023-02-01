package io.agileinfra.configserver.configbackend.server;

import io.agileinfra.configserver.configbackend.model.ConfigurationRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/configurations")
@RequiredArgsConstructor
public class ConfigurationController {

  private final List<ConfigurationRequestProcessor> processors;

  @PostMapping
  public void save(@RequestBody List<ConfigurationRequest> requests) {}
}
