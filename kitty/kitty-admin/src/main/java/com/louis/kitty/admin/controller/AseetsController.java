package com.louis.kitty.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.louis.kitty.admin.model.AseetsInfo;
import com.louis.kitty.admin.sevice.AseetsService;
import com.louis.kitty.core.http.HttpResult;

/**
 * 资产管理
 * 
 * @author Louis
 * @date Oct 29, 2018
 */
@RestController
public class AseetsController {

	@Autowired
	private AseetsService aseetsService;

//	@PreAuthorize("hasAuthority('sys:dict:add') AND hasAuthority('sys:dict:edit')")
	@PostMapping(value = "/aseets/save")
	public HttpResult save(@RequestBody AseetsInfo aseetsInfo, HttpServletRequest request) {
		List<AseetsInfo> listAseets = aseetsService.findByAseetNum(aseetsInfo.getNum());
		if (listAseets != null) {
			return HttpResult.error("资产已经存在!");
		}
		return HttpResult.ok(aseetsService.save(aseetsInfo));
	}

	@PostMapping(value = "/aseets/test")
	@Transactional
	public HttpResult test(@RequestBody AseetsInfo aseetsInfo, HttpServletRequest request) {
		aseetsService.save(aseetsInfo);
		aseetsInfo.setName("testTTTTTT");
		aseetsService.update(aseetsInfo);
		return HttpResult.ok();
	}

	/**
	 * 查询所有资产
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/all/list")
	public HttpResult getAllAseets() {
		return HttpResult.ok(aseetsService.findAllAseets());
	}

	/**
	 * 根据资产类型查询资产
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/aseetsByType")
	public HttpResult getAseetsByType(@RequestParam int type) {
		return HttpResult.ok(aseetsService.findByAseetType(type));
	}

	/**
	 * 查询名下资产
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/aseetsByHolder")
	public HttpResult getAseetsByHolder(@RequestParam long holderID) {
		return HttpResult.ok(aseetsService.findByAseetHolder(holderID));
	}

	/**
	 * 更新资产信息
	 * 
	 * @return
	 */
	@PutMapping(value = "/aseets/updateAseets")
	public HttpResult updateAseets(@RequestBody AseetsInfo aseetsInfo) {
		return HttpResult.ok(aseetsService.update(aseetsInfo));
	}
}
