package com.sree.driver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sree.driver.entity.DriverEntity;
import com.sree.driver.entity.DriverSpecialServiceEntity;
import com.sree.driver.entity.idclasses.DriverSpecialServiceIdClass;


public interface DriverSpecialServiceRepository extends CrudRepository<DriverSpecialServiceEntity, DriverSpecialServiceIdClass>{
	//@Query("SELECT d FROM DriverSpecialServiceEntity d where d.driverid=?1")
	List<DriverSpecialServiceEntity> findByDriverSpecialServiceIdClassDriverid(int id);

}
