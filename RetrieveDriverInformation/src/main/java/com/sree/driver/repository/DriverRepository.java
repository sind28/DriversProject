package com.sree.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sree.driver.entity.DriverEntity;

public interface DriverRepository extends CrudRepository<DriverEntity, Integer>{
	DriverEntity findByDriverid(int id);
}
