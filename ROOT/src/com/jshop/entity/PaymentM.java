package com.jshop.entity;

/**
 * PaymentM entity. @author MyEclipse Persistence Tools
 */

public class PaymentM implements java.io.Serializable {

	// Fields    

	private String paymentid;
	private String paymentname;
	private String paymentCode;
	private String paymentFree;
	private String paymentInterface;
	private String account;
	private String safecode;
	private String partnerid;
	private String des;
	private String isCod;
	private String isOnline;
	private String state;

	// Constructors

	/** default constructor */
	public PaymentM() {
	}

	/** minimal constructor */
	public PaymentM(String paymentid, String state) {
		this.paymentid = paymentid;
		this.state = state;
	}

	/** full constructor */
	public PaymentM(String paymentid, String paymentname, String paymentCode, String paymentFree, String paymentInterface, String account, String safecode, String partnerid, String des, String isCod, String isOnline, String state) {
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.paymentCode = paymentCode;
		this.paymentFree = paymentFree;
		this.paymentInterface = paymentInterface;
		this.account = account;
		this.safecode = safecode;
		this.partnerid = partnerid;
		this.des = des;
		this.isCod = isCod;
		this.isOnline = isOnline;
		this.state = state;
	}

	// Property accessors

	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentname() {
		return this.paymentname;
	}

	public void setPaymentname(String paymentname) {
		this.paymentname = paymentname;
	}

	public String getPaymentCode() {
		return this.paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getPaymentFree() {
		return this.paymentFree;
	}

	public void setPaymentFree(String paymentFree) {
		this.paymentFree = paymentFree;
	}

	public String getPaymentInterface() {
		return this.paymentInterface;
	}

	public void setPaymentInterface(String paymentInterface) {
		this.paymentInterface = paymentInterface;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSafecode() {
		return this.safecode;
	}

	public void setSafecode(String safecode) {
		this.safecode = safecode;
	}

	public String getPartnerid() {
		return this.partnerid;
	}

	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getIsCod() {
		return this.isCod;
	}

	public void setIsCod(String isCod) {
		this.isCod = isCod;
	}

	public String getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}