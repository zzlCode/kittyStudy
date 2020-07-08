package com.louis.kitty.admin.model;

import java.util.Date;

/**
 * 资产信息
 * 
 * @author Louis
 * @date Sep 13, 2018
 */
public class AseetsLog {

	private Long id;

	private Long assetsID;

	private String rollOut;

	private String transferInto;

	private Date time;

	private int status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAssetsID() {
		return assetsID;
	}

	public void setAssetsID(Long assetsID) {
		this.assetsID = assetsID;
	}

	public String getRollOut() {
		return rollOut;
	}

	public void setRollOut(String rollOut) {
		this.rollOut = rollOut;
	}

	public String getTransferInto() {
		return transferInto;
	}

	public void setTransferInto(String transferInto) {
		this.transferInto = transferInto;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
