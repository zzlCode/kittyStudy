package com.louis.kitty.admin.sevice;

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

}