package com.t.s.model.dto;

public class SessionIds {
	
	private String sessionid;
	private String userid;
	 
	public SessionIds() {
		
	}
	public SessionIds(String sessionid, String userid) {
		this.sessionid=sessionid;
		this.userid=userid;
	}
	
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	

}
