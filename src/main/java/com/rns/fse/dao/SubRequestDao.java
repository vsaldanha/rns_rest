package com.rns.fse.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rns.fse.entities.Request;
import com.rns.fse.entities.SubRequest;
import com.rns.fse.pojo.SubRequestModel;
import com.rns.fse.repository.SubRequestRepo;

@Component
public class SubRequestDao {

	@Autowired
	private SubRequestRepo subRequestRepo;
	
	public List<SubRequestModel> fetchAllSubRequest(){
		
		List<SubRequestModel> subRequestData = new ArrayList<SubRequestModel>();
		SubRequestModel subRequestModel = null;
		List<SubRequest> subRequest = subRequestRepo.findAll();
		for(SubRequest sr : subRequest){
			subRequestModel = new SubRequestModel();
			subRequestModel.setId(sr.getId());
			subRequestModel.setRequestId(sr.getRequestId());
			subRequestModel.setOrganizationName(sr.getOrganizationName());
			subRequestModel.setStatus(sr.getStatus());
			subRequestModel.setSubject(sr.getSubject());
			subRequestModel.setClassGrade(sr.getClassGrade());
			subRequestModel.setTimePeriod(sr.getTimePeriod());
			subRequestModel.setVolunteerName(sr.getVolunteerName());
			subRequestData.add(subRequestModel);
		}
		return subRequestData;
	}
}
