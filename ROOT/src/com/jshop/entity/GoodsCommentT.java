package com.jshop.entity;

// Generated 2012-6-25 20:29:58 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsCommentT generated by hbm2java
 */
public class GoodsCommentT implements java.io.Serializable {

	private String commentid;
	private String goodsid;
	private String goodsname;
	private String replyorcommentusername;
	private Date posttime;
	private String commentcontent;
	private Integer score;
	private String state;
	private String replyorcomment;
	private String replyid;
	private String replyorcommentuserid;
	private String emailable;
	private String title;
	private String virtualadd;

	public GoodsCommentT() {
	}

	public GoodsCommentT(String commentid, String goodsid, String goodsname,
			String replyorcommentusername, Date posttime,
			String commentcontent, String state, String replyorcomment,
			String replyorcommentuserid) {
		this.commentid = commentid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.replyorcommentusername = replyorcommentusername;
		this.posttime = posttime;
		this.commentcontent = commentcontent;
		this.state = state;
		this.replyorcomment = replyorcomment;
		this.replyorcommentuserid = replyorcommentuserid;
	}

	public GoodsCommentT(String commentid, String goodsid, String goodsname,
			String replyorcommentusername, Date posttime,
			String commentcontent, Integer score, String state,
			String replyorcomment, String replyid, String replyorcommentuserid,
			String emailable, String title, String virtualadd) {
		this.commentid = commentid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.replyorcommentusername = replyorcommentusername;
		this.posttime = posttime;
		this.commentcontent = commentcontent;
		this.score = score;
		this.state = state;
		this.replyorcomment = replyorcomment;
		this.replyid = replyid;
		this.replyorcommentuserid = replyorcommentuserid;
		this.emailable = emailable;
		this.title = title;
		this.virtualadd = virtualadd;
	}

	public String getCommentid() {
		return this.commentid;
	}

	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getReplyorcommentusername() {
		return this.replyorcommentusername;
	}

	public void setReplyorcommentusername(String replyorcommentusername) {
		this.replyorcommentusername = replyorcommentusername;
	}

	public Date getPosttime() {
		return this.posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	public String getCommentcontent() {
		return this.commentcontent;
	}

	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReplyorcomment() {
		return this.replyorcomment;
	}

	public void setReplyorcomment(String replyorcomment) {
		this.replyorcomment = replyorcomment;
	}

	public String getReplyid() {
		return this.replyid;
	}

	public void setReplyid(String replyid) {
		this.replyid = replyid;
	}

	public String getReplyorcommentuserid() {
		return this.replyorcommentuserid;
	}

	public void setReplyorcommentuserid(String replyorcommentuserid) {
		this.replyorcommentuserid = replyorcommentuserid;
	}

	public String getEmailable() {
		return this.emailable;
	}

	public void setEmailable(String emailable) {
		this.emailable = emailable;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVirtualadd() {
		return this.virtualadd;
	}

	public void setVirtualadd(String virtualadd) {
		this.virtualadd = virtualadd;
	}

}
