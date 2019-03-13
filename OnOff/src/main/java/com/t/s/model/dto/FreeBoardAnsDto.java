package com.t.s.model.dto;

import java.util.Date;

public class FreeBoardAnsDto {
	
	//테이블 명 FREEBOARDANS
	private int boardansseq;
	private int boardseq;
	private String userid;
	private int groupseq;
	private String boardanscontent;
	private Date boardansregdate;
	
	
	public FreeBoardAnsDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요

	
	public int getBoardansseq() {
		return boardansseq;
	}
	public void setBoardansseq(int boardansseq) {
		this.boardansseq = boardansseq;
	}

	public int getBoardseq() {
		return boardseq;
	}
	public void setBoardseq(int boardseq) {
		this.boardseq = boardseq;
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

	public String getBoardanscontent() {
		return boardanscontent;
	}
	public void setBoardanscontent(String boardanscontent) {
		this.boardanscontent = boardanscontent;
	}

	public Date getBoardansregdate() {
		return boardansregdate;
	}
	public void setBoardansregdate(Date boardansregdate) {
		this.boardansregdate = boardansregdate;
	}
	
	

}
