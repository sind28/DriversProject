package com.sree.location.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sree.location.entity.LocationEntity;
import com.sree.location.pojo.LocationDetails;
import com.sree.location.repository.LocationRepository;

@Controller
@RequestMapping("locations")
public class LocationController {
private LocationRepository locRepository;

@Autowired
public  LocationController (LocationRepository locRepository) {
	this.locRepository=locRepository;
}

@GetMapping("/location/{locid}")
@ResponseBody
public HashMap<String, Object> locDetails(@PathVariable("locid") int locid){
	LocationEntity locEntity = locRepository.findByLocationid(locid);
	LocationDetails locInfo = new LocationDetails();
	locInfo=buildLocationInformation(locEntity);
	HashMap<String, Object> rtn = new LinkedHashMap<String, Object>();
	rtn.put("locationDetails", locInfo);
	return rtn;
}
public LocationDetails buildLocationInformation(LocationEntity locEntity) {
	
	LocationDetails locDetailsInfo = new LocationDetails();
	locDetailsInfo.setLocationid(locEntity.getlocationid());
	locDetailsInfo.setLocationname(locEntity.getlocation_name());
	locDetailsInfo.setAddress1(locEntity.getAddress1());
	locDetailsInfo.setAddress2(locEntity.getAddress2());
	locDetailsInfo.setCity(locEntity.getCity());
	locDetailsInfo.setState(locEntity.getState());
	locDetailsInfo.setZip(locEntity.getZip());
	locDetailsInfo.setCountry(locEntity.getCountry());
	
	return locDetailsInfo;
}
}
