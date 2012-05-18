package com.jshop.entity;

/**
 * ExpresstempleteT entity. @author MyEclipse Persistence Tools
 */

public class ExpresstempleteT implements java.io.Serializable {

	// Fields    

	private String expresstempleteid;
	private String sendName;
	private String sendCountry;
	private String sendProvince;
	private String sendCity;
	private String sendDistrict;
	private String sendStreet;
	private String sendTelno;
	private String sendMobile;
	private String recipientName;
	private String recipientCountry;
	private String recipientProvince;
	private String recipientCity;
	private String recipientDistrict;
	private String recipientStreet;
	private String recipientTelno;
	private String recipientMobile;
	private String recipientPostcode;
	private String year;
	private String month;
	private String day;
	private String orderid;
	private String notes;
	private String sendTime;
	private String rightTag;
	private String logisticsid;
	private String state;
	private String expressCss;
	private String expressImg;
	private String kindeditorCode;
	private String sendContactor;
	private String recipientContactor;
	private String hour;
	private String minutes;
	private String quantity;

	// Constructors

	/** default constructor */
	public ExpresstempleteT() {
	}

	/** minimal constructor */
	public ExpresstempleteT(String expresstempleteid) {
		this.expresstempleteid = expresstempleteid;
	}

	/** full constructor */
	public ExpresstempleteT(String expresstempleteid, String sendName, String sendCountry, String sendProvince, String sendCity, String sendDistrict, String sendStreet, String sendTelno, String sendMobile, String recipientName, String recipientCountry, String recipientProvince, String recipientCity, String recipientDistrict, String recipientStreet, String recipientTelno, String recipientMobile, String recipientPostcode, String year, String month, String day, String orderid, String notes, String sendTime, String rightTag, String logisticsid, String state, String expressCss, String expressImg, String kindeditorCode, String sendContactor, String recipientContactor, String hour, String minutes, String quantity) {
		this.expresstempleteid = expresstempleteid;
		this.sendName = sendName;
		this.sendCountry = sendCountry;
		this.sendProvince = sendProvince;
		this.sendCity = sendCity;
		this.sendDistrict = sendDistrict;
		this.sendStreet = sendStreet;
		this.sendTelno = sendTelno;
		this.sendMobile = sendMobile;
		this.recipientName = recipientName;
		this.recipientCountry = recipientCountry;
		this.recipientProvince = recipientProvince;
		this.recipientCity = recipientCity;
		this.recipientDistrict = recipientDistrict;
		this.recipientStreet = recipientStreet;
		this.recipientTelno = recipientTelno;
		this.recipientMobile = recipientMobile;
		this.recipientPostcode = recipientPostcode;
		this.year = year;
		this.month = month;
		this.day = day;
		this.orderid = orderid;
		this.notes = notes;
		this.sendTime = sendTime;
		this.rightTag = rightTag;
		this.logisticsid = logisticsid;
		this.state = state;
		this.expressCss = expressCss;
		this.expressImg = expressImg;
		this.kindeditorCode = kindeditorCode;
		this.sendContactor = sendContactor;
		this.recipientContactor = recipientContactor;
		this.hour = hour;
		this.minutes = minutes;
		this.quantity = quantity;
	}

	// Property accessors

	public String getExpresstempleteid() {
		return this.expresstempleteid;
	}

	public void setExpresstempleteid(String expresstempleteid) {
		this.expresstempleteid = expresstempleteid;
	}

	public String getSendName() {
		return this.sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public String getSendCountry() {
		return this.sendCountry;
	}

	public void setSendCountry(String sendCountry) {
		this.sendCountry = sendCountry;
	}

	public String getSendProvince() {
		return this.sendProvince;
	}

	public void setSendProvince(String sendProvince) {
		this.sendProvince = sendProvince;
	}

	public String getSendCity() {
		return this.sendCity;
	}

	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}

	public String getSendDistrict() {
		return this.sendDistrict;
	}

	public void setSendDistrict(String sendDistrict) {
		this.sendDistrict = sendDistrict;
	}

	public String getSendStreet() {
		return this.sendStreet;
	}

	public void setSendStreet(String sendStreet) {
		this.sendStreet = sendStreet;
	}

	public String getSendTelno() {
		return this.sendTelno;
	}

	public void setSendTelno(String sendTelno) {
		this.sendTelno = sendTelno;
	}

	public String getSendMobile() {
		return this.sendMobile;
	}

	public void setSendMobile(String sendMobile) {
		this.sendMobile = sendMobile;
	}

	public String getRecipientName() {
		return this.recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientCountry() {
		return this.recipientCountry;
	}

	public void setRecipientCountry(String recipientCountry) {
		this.recipientCountry = recipientCountry;
	}

	public String getRecipientProvince() {
		return this.recipientProvince;
	}

	public void setRecipientProvince(String recipientProvince) {
		this.recipientProvince = recipientProvince;
	}

	public String getRecipientCity() {
		return this.recipientCity;
	}

	public void setRecipientCity(String recipientCity) {
		this.recipientCity = recipientCity;
	}

	public String getRecipientDistrict() {
		return this.recipientDistrict;
	}

	public void setRecipientDistrict(String recipientDistrict) {
		this.recipientDistrict = recipientDistrict;
	}

	public String getRecipientStreet() {
		return this.recipientStreet;
	}

	public void setRecipientStreet(String recipientStreet) {
		this.recipientStreet = recipientStreet;
	}

	public String getRecipientTelno() {
		return this.recipientTelno;
	}

	public void setRecipientTelno(String recipientTelno) {
		this.recipientTelno = recipientTelno;
	}

	public String getRecipientMobile() {
		return this.recipientMobile;
	}

	public void setRecipientMobile(String recipientMobile) {
		this.recipientMobile = recipientMobile;
	}

	public String getRecipientPostcode() {
		return this.recipientPostcode;
	}

	public void setRecipientPostcode(String recipientPostcode) {
		this.recipientPostcode = recipientPostcode;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getRightTag() {
		return this.rightTag;
	}

	public void setRightTag(String rightTag) {
		this.rightTag = rightTag;
	}

	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getExpressCss() {
		return this.expressCss;
	}

	public void setExpressCss(String expressCss) {
		this.expressCss = expressCss;
	}

	public String getExpressImg() {
		return this.expressImg;
	}

	public void setExpressImg(String expressImg) {
		this.expressImg = expressImg;
	}

	public String getKindeditorCode() {
		return this.kindeditorCode;
	}

	public void setKindeditorCode(String kindeditorCode) {
		this.kindeditorCode = kindeditorCode;
	}

	public String getSendContactor() {
		return this.sendContactor;
	}

	public void setSendContactor(String sendContactor) {
		this.sendContactor = sendContactor;
	}

	public String getRecipientContactor() {
		return this.recipientContactor;
	}

	public void setRecipientContactor(String recipientContactor) {
		this.recipientContactor = recipientContactor;
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinutes() {
		return this.minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}