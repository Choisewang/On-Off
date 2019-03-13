package com.t.s.model.dto;

import java.util.Date;

public class MoimDto {
	
	//테이블 명 MOIM
	
	private int moimseq;
	private String userid;
	private int groupseq;
	private String moimtitle;
	private String moimcontent;
	private String moimrecruit;
	private String moimaddr;
	private Date moimregdate;
	private Date moimenddate;
	private Date moimdate;
	
	
	public MoimDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요


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

	public String getMoimtitle() {
		return moimtitle;
	}
	public void setMoimtitle(String moimtitle) {
		this.moimtitle = moimtitle;
	}

	public String getMoimcontent() {
		return moimcontent;
	}
	public void setMoimcontent(String moimcontent) {
		this.moimcontent = moimcontent;
	}

	public String getMoimrecruit() {
		return moimrecruit;
	}
	public void setMoimrecruit(String moimrecruit) {
		this.moimrecruit = moimrecruit;
	}

	public String getMoimaddr() {
		return moimaddr;
	}
	public void setMoimaddr(String moimaddr) {
		this.moimaddr = moimaddr;
	}

	public Date getMoimregdate() {
		return moimregdate;
	}
	public void setMoimregdate(Date moimregdate) {
		this.moimregdate = moimregdate;
	}

	public Date getMoimenddate() {
		return moimenddate;
	}
	public void setMoimenddate(Date moimenddate) {
		this.moimenddate = moimenddate;
	}

	public Date getMoimdate() {
		return moimdate;
	}
	public void setMoimdate(Date moimdate) {
		this.moimdate = moimdate;
	}
	
}
