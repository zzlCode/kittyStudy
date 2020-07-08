package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.admin.dao.AseetsMapper;
import com.louis.kitty.admin.model.AseetsInfo;
import com.louis.kitty.admin.sevice.AseetsService;

@Service
public class AseetsServiceImpl implements AseetsService {

	@Autowired
	private AseetsMapper aseetsMapper;

	@Override
	public int save(AseetsInfo record) {
		aseetsMapper.insertAseetsInfo(record);
		return 1;
	}

	@Override
	public List<AseetsInfo> findAllAseets() {
		List<AseetsInfo> aseetsList = aseetsMapper.findAllAseets();
		return aseetsList;
	}

	@Override
	public List<AseetsInfo> findByAseetType(int type) {
		List<AseetsInfo> aseetsList = aseetsMapper.findByAseetType(type);
		return aseetsList;
	}

	@Override
	public List<AseetsInfo> findByAseetHolder(long holderID) {
		List<AseetsInfo> aseetsList = aseetsMapper.findByAseetHolder(holderID);
		return aseetsList;
	}

	@Override
	public int update(AseetsInfo record) {
		aseetsMapper.updateByAseetID(record);
		return 1;
	}

}
