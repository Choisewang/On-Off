package com.t.s.model.dto;

import java.util.Date;

public class FreeBoardDto {
	
	//테이블 명 FREEBOARD
	
	private int boardseq;
	private String userid;
	private int groupseq;
	private String boardtitle;
	private String boardcontent;
	private Date boardregdate;
	
	
	public FreeBoardDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요

	
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

	public String getBoardtitle() {
		return boardtitle;
	}
	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardcontent() {
		return boardcontent;
	}
	public void setBoardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}

	public Date getBoardregdate() {
		return boardregdate;
	}
	public void setBoardregdate(Date boardregdate) {
		this.boardregdate = boardregdate;
	}
		

}
