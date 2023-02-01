package io.agileinfra.configserver.configbackend.server.persistence;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@RedisHash("application-staging")
public class StagingConfiguration implements Serializable {

  @Id
  String key;

  String value;
}
