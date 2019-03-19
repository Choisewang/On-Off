package com.chat.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

public class SingleMoim {

	private List<WebSocketSession> sessionList; //한개의 모임세션

	
	public SingleMoim() {
		this.sessionList = new ArrayList<>();
	}
	
	public SingleMoim(List<WebSocketSession> sessionList) {
		this.sessionList = sessionList;
	}

	public List<WebSocketSession> getSessionList() {
		return sessionList;
	}
	
	public void setSessionList(List<WebSocketSession> sessionList) {
		this.sessionList = sessionList;
	}
	
	public void addSession(WebSocketSession session) {
		sessionList.add(session);
	}
	
}
