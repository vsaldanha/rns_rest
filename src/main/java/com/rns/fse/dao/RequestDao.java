package com.rns.fse.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rns.fse.entities.Request;
import com.rns.fse.pojo.RequestModel;
import com.rns.fse.repository.RequestRepo;

@Component
public class RequestDao {
	
	@Autowired
	private RequestRepo requestRepo;
	
	public List<RequestModel> fetchAllRequest(){
		
		List<RequestModel> requestData = new ArrayList<RequestModel>();
		RequestModel requestModel = null;
		List<Request> request = requestRepo.findAll();
		for(Request req : request){
			requestModel = new RequestModel();
			requestModel.setId(req.getId());
			requestModel.setSchoolId(req.getSchoolId());
			requestModel.setEventType(req.getEventType());
			requestModel.setEventType(req.getEventDate());
			requestModel.setStatus(req.getStatus());
			requestModel.setCreationDate(req.getCreationDate());
			requestData.add(requestModel);
		}
		return requestData;
		
	}

}
