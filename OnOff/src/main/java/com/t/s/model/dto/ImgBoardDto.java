package com.t.s.model.dto;

import java.util.Date;

public class ImgBoardDto {
	
	// 테이블 명 IMGBOARD
	
	private int imgboardseq;
	private int moimseq;
	private String userid;
	private int groupseq;
	private String imgboardtitle;
	private String imgboardcontent;
	private Date imgboardregdate;
	
	
	public ImgBoardDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요

	
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

	public String getImgboardtitle() {
		return imgboardtitle;
	}
	public void setImgboardtitle(String imgboardtitle) {
		this.imgboardtitle = imgboardtitle;
	}

	public String getImgboardcontent() {
		return imgboardcontent;
	}
	public void setImgboardcontent(String imgboardcontent) {
		this.imgboardcontent = imgboardcontent;
	}

	public Date getImgboardregdate() {
		return imgboardregdate;
	}
	public void setImgboardregdate(Date imgboardregdate) {
		this.imgboardregdate = imgboardregdate;
	}
	
	
	
	

}
