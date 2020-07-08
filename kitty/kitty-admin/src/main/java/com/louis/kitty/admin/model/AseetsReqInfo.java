package com.louis.kitty.admin.model;

import java.util.Date;

/**
 * 资产请求信息
 * 
 */
public class AseetsReqInfo {

	private int id;

	private int aseetsID;

	private long applicantID;

	private String applicant;

	private long holderID;

	private String holder;

	private int status;

	private Date startTime;

	private String remark;

	private Date endTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAseetsID() {
		return aseetsID;
	}

	public void setAseetsID(int aseetsID) {
		this.aseetsID = aseetsID;
	}

	public long getApplicantID() {
		return applicantID;
	}

	public void setApplicantID(long applicantID) {
		this.applicantID = applicantID;
	}

	public long getHolderID() {
		return holderID;
	}

	public void setHolderID(long holderID) {
		this.holderID = holderID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

}
