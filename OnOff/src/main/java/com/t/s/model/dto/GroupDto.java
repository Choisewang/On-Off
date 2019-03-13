package com.t.s.model.dto;

import java.util.Date;

public class GroupDto {
	
	//테이블 명 GROUPINFO
	private int groupseq;
	private String grouptitle;
	private String groupcontent;
	private Date groupregdate;
	private String groupimg;
	
	
	public GroupDto() {
		//super();
	}
	
	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요


	public int getGroupseq() {
		return groupseq;
	}
	public void setGroupseq(int groupseq) {
		this.groupseq = groupseq;
	}

	public String getGrouptitle() {
		return grouptitle;
	}
	public void setGrouptitle(String grouptitle) {
		this.grouptitle = grouptitle;
	}

	public String getGroupcontent() {
		return groupcontent;
	}
	public void setGroupcontent(String groupcontent) {
		this.groupcontent = groupcontent;
	}

	public Date getGroupdate() {
		return groupregdate;
	}
	public void setGroupdate(Date groupregdate) {
		this.groupregdate = groupregdate;
	}

	public String getGroupimg() {
		return groupimg;
	}
	public void setGroupimg(String groupimg) {
		this.groupimg = groupimg;
	}
	
	
	
	

}
