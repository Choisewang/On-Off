package com.chat.config;

public class SessionIds {
	
	private String SessionId;
	private String userId;
	
	public SessionIds() {
		
	}
	public SessionIds(String SessionId, String userId) {
		this.SessionId=SessionId;
		this.userId=userId;
	}
	
	public String getSessionId() {
		return SessionId;
	}
	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
