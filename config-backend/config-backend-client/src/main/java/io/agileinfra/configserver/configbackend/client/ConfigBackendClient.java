package io.agileinfra.configserver.configbackend.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Slf4j
public class ConfigBackendClient {

  private final String apiUrl;
  private final RestTemplate restTemplate;
}
