package com.louis.kitty.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.louis.kitty.admin.model.AseetsReqInfo;

public interface AseetsReqMapper {

	int insertAseetsReqInfo(AseetsReqInfo aseetReq);

	List<AseetsReqInfo> findByAseetID(@Param(value = "aseetsID") int aseetsID);

	List<AseetsReqInfo> findMyReq(@Param(value = "applicantID") int applicantID);

	List<AseetsReqInfo> findMyRes(@Param(value = "holderID") int holderID);

//	int updateByAseetID(AseetsReqInfo aseetReq);
//
////	int updateAseets(AseetsInfo aseetsInfo);
//
//	List<AseetsInfo> findByAseetType(@Param(value = "type") int type);
//
//	List<AseetsInfo> findAllAseets();
//
//	List<AseetsInfo> findByAseetHolder(@Param(value = "holderID") long holderID);

}