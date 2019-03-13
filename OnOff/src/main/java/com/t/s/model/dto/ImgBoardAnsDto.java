package com.t.s.model.dto;

import java.util.Date;

public class ImgBoardAnsDto {
	
	//테이블 명 IMGBOARDANS
	
	private int imgansseq;
	private int imgboardseq;
	private int moimseq;
	private String userid;
	private int groupseq;
	private String imganscontent;
	private Date imgansregdate;
	
	
	public ImgBoardAnsDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요

	
	public int getImgansseq() {
		return imgansseq;
	}
	public void setImgansseq(int imgansseq) {
		this.imgansseq = imgansseq;
	}

	public int getImgboardseq() {
		return imgboardseq;
	}
	public void setImgboardseq(int imgboardseq) {
		this.imgboardseq = imgboardseq;
	}

	public int getMoimseq() {
		return moimseq;
	}
	public void setMoimseq(int moimseq) {
		this.moimseq = moimseq;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getGroupseq() {
		return groupseq;
	}
	public void setGroupseq(int groupseq) {
		this.groupseq = groupseq;
	}

	public String getImganscontent() {
		return imganscontent;
	}
	public void setImganscontent(String imganscontent) {
		this.imganscontent = imganscontent;
	}

	public Date getImgansregdate() {
		return imgansregdate;
	}
	public void setImgansregdate(Date imgansregdate) {
		this.imgansregdate = imgansregdate;
	}

}
