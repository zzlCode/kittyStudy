package com.louis.kitty.admin.sevice;

import java.util.List;

import com.louis.kitty.admin.model.AseetsReqInfo;

/**
 * 菜单管理
 * 
 * @author Louis
 * @date Oct 29, 2018
 */
//public interface AseetsService extends CurdService<AseetsInfo> {
public interface AseetsReqService {

	int save(AseetsReqInfo record);

	List<AseetsReqInfo> findByAseetID(int aseetID);

	List<AseetsReqInfo> findMyReq(int applicantID);

	List<AseetsReqInfo> findMyRes(int holderID);

	int updateReqStatus(List<AseetsReqInfo> records);

	List<AseetsReqInfo> findAseetReqLog(int aseetsID);

}
