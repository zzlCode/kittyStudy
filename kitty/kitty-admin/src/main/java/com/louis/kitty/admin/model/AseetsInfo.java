package com.louis.kitty.admin.model;

import java.util.Date;

/**
 * 资产信息
 * 
 */
public class AseetsInfo {

	private int id;

	private String name;

	private String num;

	private int status;

	private int type;

	private Date measureTime;

	private int attribute;

	private String holder;

	private long holderID;

	private Date storageTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

//	public Date getMeasureTime() {
//		return measureTime;
//	}
//
//	public void setMeasureTime(Timestamp measureTime) {
//		this.measureTime = measureTime;
//	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Date getMeasureTime() {
		return measureTime;
	}

	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}

	public Date getStorageTime() {
		return storageTime;
	}

	public void setStorageTime(Date storageTime) {
		this.storageTime = storageTime;
	}

	public long getHolderID() {
		return holderID;
	}

	public void setHolderID(long holderID) {
		this.holderID = holderID;
	}

//	public Date getStorageTime() {
//		return storageTime;
//	}
//
//	public void setStorageTime(Timestamp storageTime) {
//		this.storageTime = storageTime;
//	}

}
