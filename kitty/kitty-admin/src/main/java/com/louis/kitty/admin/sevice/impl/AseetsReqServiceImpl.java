package com.louis.kitty.admin.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.admin.dao.AseetsReqMapper;
import com.louis.kitty.admin.model.AseetsReqInfo;
import com.louis.kitty.admin.sevice.AseetsReqService;

@Service
public class AseetsReqServiceImpl implements AseetsReqService {

	@Autowired
	private AseetsReqMapper aseetsReqMapper;

	@Override
	public int save(AseetsReqInfo aseetReq) {
		aseetsReqMapper.insertAseetsReqInfo(aseetReq);
		return 1;
	}

}
