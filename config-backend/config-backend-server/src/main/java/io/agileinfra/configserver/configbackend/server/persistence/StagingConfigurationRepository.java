package io.agileinfra.configserver.configbackend.server.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StagingConfigurationRepository extends CrudRepository<StagingConfiguration, String> {}
