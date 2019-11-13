package com.sree.location.repository;

import org.springframework.data.repository.CrudRepository;

import com.sree.location.entity.LocationEntity;

public interface LocationRepository extends CrudRepository<LocationEntity, Integer>{
	LocationEntity findByLocationid(int locid);
}
