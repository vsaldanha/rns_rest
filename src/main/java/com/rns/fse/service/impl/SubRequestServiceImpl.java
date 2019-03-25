package com.rns.fse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rns.fse.dao.SubRequestDao;
import com.rns.fse.pojo.SubRequestModel;
import com.rns.fse.service.intf.SubRequestService;

@Component
public class SubRequestServiceImpl implements SubRequestService{

	@Autowired
	SubRequestDao subRequestDao;
	
	@Override
	public List<SubRequestModel> fetchAllSubRequestService() {
		List<SubRequestModel> subRequestModel = subRequestDao.fetchAllSubRequest();
		return subRequestModel;
	}

}
