package io.agileinfra.configserver.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Slf4j
public class ConfigServerClient {

  private final String apiUrl;
  private final RestTemplate restTemplate;
}
