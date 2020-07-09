package com.louis.kitty.admin.sevice;

import java.util.List;

import com.louis.kitty.admin.model.AseetsInfo;

/**
 * 菜单管理
 * 
 * @author Louis
 * @date Oct 29, 2018
 */
//public interface AseetsService extends CurdService<AseetsInfo> {
public interface AseetsService {

	int save(AseetsInfo record);

	int update(AseetsInfo record);

	/**
	 * 查询菜单树,用户ID和用户名为空则查询全部
	 * 
	 * @param menuType 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
	 * @param userId
	 * @return
	 */
	List<AseetsInfo> findAllAseets();

	List<AseetsInfo> findByAseetType(int type);

	List<AseetsInfo> findByAseetHolder(long holderID);

	List<AseetsInfo> findByAseetNum(String num);

}
