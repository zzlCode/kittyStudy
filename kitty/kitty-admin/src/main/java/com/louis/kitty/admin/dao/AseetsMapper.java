package com.louis.kitty.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.louis.kitty.admin.model.AseetsInfo;

public interface AseetsMapper {

	int insertAseetsInfo(AseetsInfo aseet);

	int updateByAseetID(AseetsInfo aseet);

//	int updateAseets(AseetsInfo aseetsInfo);

	List<AseetsInfo> findByAseetType(@Param(value = "type") int type);

	List<AseetsInfo> findAllAseets();

	List<AseetsInfo> findByAseetHolder(@Param(value = "holderID") long holderID);

	List<AseetsInfo> findByAseetNum(@Param(value = "num") String num);

}