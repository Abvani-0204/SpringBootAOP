package com.ab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.model.WebServiceModel;
import com.ab.repository.WebServiceRepository;

@Service
public class WebSrvService {

	@Autowired
	private WebServiceRepository webServiceRepository;

	public void saveRecord(WebServiceModel webServiceModel) {
		webServiceRepository.save(webServiceModel);
	}

	public List<WebServiceModel> getAllRecords() {
		List<WebServiceModel> l = webServiceRepository.findAll();
		return l;
	}

	public Optional<WebServiceModel> getRecordById(int id) {
		return webServiceRepository.findById(id);
	}

	public int updateRecordById(WebServiceModel webServiceModel, int id) {
		return webServiceRepository.updateRecordById(webServiceModel.getUname(), webServiceModel.getUmail(),
				webServiceModel.getUpassword(), id);
	}

	public void deleteRecordById(int id) {
		webServiceRepository.deleteById(id);
	}
	
	public Optional<WebServiceModel> getRecordByEmailId(String email){
		return webServiceRepository.findByumail(email);
	}
}
