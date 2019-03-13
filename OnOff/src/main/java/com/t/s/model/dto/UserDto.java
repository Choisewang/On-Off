package com.t.s.model.dto;

import java.util.Date;

public class UserDto {
	
	// 테이블 명 USERINFO
	private String userid;
	private String userpw;
	private String usergrade;
	private String username;
	private Date userbirth;
	private String useremail;
	private String useraddr;
	private String usergender;
	private int userphone;
	private Date userregdate;
	
	
	public UserDto() {
		//super();
	}

	//파라미터 포함된 생성자는 만들어서 사용하세요 말씀해주시고요


	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsergrade() {
		return usergrade;
	}
	public void setUsergrade(String usergrade) {
		this.usergrade = usergrade;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Date getUserbirth() {
		return userbirth;
	}
	public void setUserbirth(Date userbirth) {
		this.userbirth = userbirth;
	}

	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUseraddr() {
		return useraddr;
	}
	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}

	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public int getUserphone() {
		return userphone;
	}
	public void setUserphone(int userphone) {
		this.userphone = userphone;
	}

	public Date getUserregdate() {
		return userregdate;
	}
	public void setUserregdate(Date userregdate) {
		this.userregdate = userregdate;
	}
	
}
