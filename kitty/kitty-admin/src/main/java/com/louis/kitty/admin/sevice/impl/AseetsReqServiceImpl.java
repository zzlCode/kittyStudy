package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public List<AseetsReqInfo> findByAseetID(int aseetID) {
		List<AseetsReqInfo> aseetsReqList = aseetsReqMapper.findByAseetID(aseetID);
		return aseetsReqList;
	}

	@Override
	public List<AseetsReqInfo> findMyReq(int applicantID) {
		List<AseetsReqInfo> aseetsReqList = aseetsReqMapper.findMyReq(applicantID);
		return aseetsReqList;
	}

	@Override
	public List<AseetsReqInfo> findMyRes(int holderID) {
		List<AseetsReqInfo> aseetsReqList = aseetsReqMapper.findMyRes(holderID);
		return aseetsReqList;
	}

	@Transactional
	@Override
	public int updateReqStatus(List<AseetsReqInfo> records) {
		if (records == null || records.isEmpty()) {
			return 1;
		}
		for (AseetsReqInfo record : records) {
			aseetsReqMapper.updateReqStatus(record);
		}
		return 1;
	}

	@Override
	public List<AseetsReqInfo> findAseetReqLog(int aseetsID) {
		List<AseetsReqInfo> aseetsReqList = aseetsReqMapper.findAseetLog(aseetsID);
		return aseetsReqList;
	}

}
