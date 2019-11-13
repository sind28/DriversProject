package com.sree.driver.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sree.driver.entity.DriverEntity;
import com.sree.driver.entity.DriverSpecialServiceEntity;
import com.sree.driver.pojo.DriverInformation;
import com.sree.driver.pojo.DriverSpecialServicesPOJO;
import com.sree.driver.repository.DriverRepository;
import com.sree.driver.service.DriverService;

//@RestController
@Controller
@RequestMapping("drivers")
public class DriverController {
private DriverRepository driverRepository;
private DriverService driverService	;
//	@Autowired
//	public DriverController(DriverRepository driverRepository) {
//		this.driverRepository=driverRepository;
//	}
	@Autowired
	public DriverController(DriverService driverService) {
		this.driverService=driverService;
	}
	
	@GetMapping("/driver/{driverId}")
	@ResponseBody
	public HashMap<String, Object> driverName(@PathVariable("driverId") String driverId) {
		DriverEntity drvDetails = driverService.getDriverFirstName(driverId);
		
		List<DriverSpecialServiceEntity> drvSplSrvDetails = driverService.getDriverSpecialServices(driverId);
		String uri = "http://localhost:8080/RetrieveLocationInformation-1.0/locations/location/";

		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objMapper = new ObjectMapper();
		DriverInformation drvInfo = buildDriverInformation(drvDetails, drvSplSrvDetails);
		String result = restTemplate.getForObject(uri+drvInfo.getHome_location_id(), String.class);
		HashMap<String, Object> rtn = new LinkedHashMap<String, Object>();

		drvInfo.setLocDetails(result);
		rtn.put("driverDetails", drvInfo);

		//DriverEntity drv=driverRepository.findByDriverid(Integer.parseInt(driverId));
		return rtn;
		
		//return driverId;
	}
//	@GetMapping("/driverspecialservice/{driverId}/test")
//	@ResponseBody
//	public String driverSpecialService(@PathVariable("driverId") String driverId) {
//		
//		DriverEntity drv=driverRepository.findByDriverid(Integer.parseInt(driverId));
//		return drv.getLast_name();
//		
//		//return driverId;
//	}
	public DriverInformation buildDriverInformation(DriverEntity drvEntity, List<DriverSpecialServiceEntity> splSvsEntity) {
		DriverInformation drvInfo = new DriverInformation();
		drvInfo.setDriverid(drvEntity.getDriverid());
		drvInfo.setFirst_name(drvEntity.getFirst_name());
		drvInfo.setDate_of_birth(drvEntity.getDate_of_birth());
		drvInfo.setDate_of_hire(drvEntity.getDate_of_hire());
		drvInfo.setDriver_type(drvEntity.getDriver_type());
		drvInfo.setHome_location_id(drvEntity.getHome_location_id());
		drvInfo.setRate_offering_id(drvEntity.getRate_offering_id());
		Map<Integer,DriverSpecialServicesPOJO> splServices = new HashMap();
		int i=0;
		for (DriverSpecialServiceEntity splSvs: splSvsEntity) {
			System.out.println(splSvs.getDriverSpecialServiceIdClass().getspecial_service_name());
			DriverSpecialServicesPOJO specialSvc = new DriverSpecialServicesPOJO();
			specialSvc.setSpecialServiceName(splSvs.getDriverSpecialServiceIdClass().getspecial_service_name());
			specialSvc.setSpecialServiceSeq(splSvs.getDriverSpecialServiceIdClass().getspecial_service_seq());
			specialSvc.setEndDate(splSvs.getEndDate());
			specialSvc.setStartDate(splSvs.getStartDate());
			splServices.put(i,specialSvc );
			i++;

		}
		drvInfo.setSpecialServices(splServices);
		
		return drvInfo;
		
	}
	
}
