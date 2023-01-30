package io.agileinfra.configserver.configbackend.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigBackendServer {

  public static void main(String[] args) {
    SpringApplication.run(ConfigBackendServer.class, args);
  }
}
