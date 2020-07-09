package com.louis.kitty.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * 查询某资产的请求
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/aseetReq")
	public HttpResult getAseetsByType(@RequestParam int aseetID) {
		return HttpResult.ok(aseetsReqService.findByAseetID(aseetID));
	}

	/**
	 * 查看我的请求
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/user/aseetReq")
	public HttpResult getMyReq(@RequestParam int applicantID) {
		return HttpResult.ok(aseetsReqService.findMyReq(applicantID));
	}

	/**
	 * 查看待我处理
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/user/aseetRes")
	public HttpResult getMyRes(@RequestParam int holderID) {
		return HttpResult.ok(aseetsReqService.findMyRes(holderID));
	}

	/**
	 * 处理请求
	 * 
	 * @return
	 */
	@PutMapping(value = "/aseets/handle/aseetReq")
	public HttpResult handleReq(@RequestBody List<AseetsReqInfo> listReq) {

		return HttpResult.ok(aseetsReqService.updateReqStatus(listReq));
	}

	/**
	 * 资产变更日志
	 * 
	 * @return
	 */
	@GetMapping(value = "/aseets/log")
	public HttpResult getAseetLog(@RequestParam int aseetID) {

		return HttpResult.ok(aseetsReqService.findAseetReqLog(aseetID));
	}

}
