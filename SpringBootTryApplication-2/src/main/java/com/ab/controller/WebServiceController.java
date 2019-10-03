package com.ab.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.WebServiceModel;
import com.ab.service.WebSrvService;

@RestController
public class WebServiceController {

	public static Logger log = LoggerFactory.getLogger(WebServiceController.class);
	@Autowired
	private WebSrvService webSrvService;

	@PostMapping(value = "/save")
	public void saveRecord(@RequestBody WebServiceModel webServiceModel) {
		webSrvService.saveRecord(webServiceModel);
	}

	@GetMapping(value = "/get")
	public List<WebServiceModel> getAllRecords() {
		return webSrvService.getAllRecords();
	}

	@GetMapping(value = "/get/{id}")
	public Optional<WebServiceModel> getRecordById(@PathVariable int id) {
		return webSrvService.getRecordById(id);
	}

	@PutMapping(value = "/update/id/{id}")
	public int updateRecordById(@RequestBody WebServiceModel webServiceModel, @PathVariable int id) {
		return webSrvService.updateRecordById(webServiceModel, id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteRecordById(@PathVariable int id) {
		webSrvService.deleteRecordById(id);
	}

	@GetMapping(value = "/get/mail/{email}")
	public Optional<WebServiceModel> getRecordByEmailId(@PathVariable String email) {
		return webSrvService.getRecordByEmailId(email);
	}
}
