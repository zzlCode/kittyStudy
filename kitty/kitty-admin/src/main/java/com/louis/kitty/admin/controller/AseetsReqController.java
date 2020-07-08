package com.louis.kitty.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.louis.kitty.admin.model.AseetsReqInfo;
import com.louis.kitty.admin.sevice.AseetsReqService;
import com.louis.kitty.core.http.HttpResult;

/**
 * 资产管理
 * 
 * @author Louis
 * @date Oct 29, 2018
 */
@RestController
public class AseetsReqController {

	@Autowired
	private AseetsReqService aseetsReqService;

//	@PreAuthorize("hasAuthority('sys:dict:add') AND hasAuthority('sys:dict:edit')")
	@PostMapping(value = "/aseets/saveReq")
	public HttpResult save(@RequestBody AseetsReqInfo aseetsReqInfo, HttpServletRequest request) {
		return HttpResult.ok(aseetsReqService.save(aseetsReqInfo));
	}
}
