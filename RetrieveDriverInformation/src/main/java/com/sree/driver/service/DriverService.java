package com.sree.driver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.driver.entity.DriverEntity;
import com.sree.driver.entity.DriverSpecialServiceEntity;
import com.sree.driver.repository.DriverRepository;
import com.sree.driver.repository.DriverSpecialServiceRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;
	@Autowired
	private DriverSpecialServiceRepository driverSplSvcRepository;
	
	public DriverEntity getDriverFirstName(String driverId) {
		DriverEntity drv=driverRepository.findByDriverid(Integer.parseInt(driverId));
		return drv;
	}
	public List<DriverSpecialServiceEntity> getDriverSpecialServices(String driverId) {
		List<DriverSpecialServiceEntity> drv=driverSplSvcRepository.findByDriverSpecialServiceIdClassDriverid(Integer.parseInt(driverId));
		return drv;
	}
}
