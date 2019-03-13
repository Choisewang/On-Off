package com.t.s.model.dto;

import java.util.Date;

public class MoimAnsDto {
	
	//테이블 명 MOIMANS
	
	private int moimansseq;
	private int moimseq;
	private String userid;
	private int groupseq;
	private String moimanscontent;
	private Date moimansregdate;
	
	
	public MoimAnsDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요

	
	public int getMoimansseq() {
		return moimansseq;
	}
	public void setMoimansseq(int moimansseq) {
		this.moimansseq = moimansseq;
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

	public String getMoimanscontent() {
		return moimanscontent;
	}
	public void setMoimanscontent(String moimanscontent) {
		this.moimanscontent = moimanscontent;
	}

	public Date getMoimansregdate() {
		return moimansregdate;
	}
	public void setMoimansregdate(Date moimansregdate) {
		this.moimansregdate = moimansregdate;
	}
	
	
	
}
