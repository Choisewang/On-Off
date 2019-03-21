package com.chat.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.t.s.model.dto.GroupUserDto;


public class EchoHandler extends TextWebSocketHandler {

	private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();
	
	private Map<Integer, SingleMoim> moims = new HashMap<Integer, SingleMoim>();
	
	SingleMoim singleMoim = new SingleMoim();
	
	GroupUserDto dto;
	// 웹소켓 서버에 클라이언트가 접속하면 호출되는 메소드   
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		Map<String, Object> map = session.getAttributes();
		dto = (GroupUserDto)map.get("dto"); //아이디랑 그룹아이디 불러옴
		
		singleMoim.addSession(session);		
		
		moims.put(dto.getGroupno(), singleMoim);
		
		//잘들어가 있는지 확인용
		System.out.println(dto.getGroupno()+"groupnum임");
		System.out.println(moims.get(dto.getGroupno()).getSessionList()+"들어가는있값이 무엇인지 보자");
		
		List<WebSocketSession> abc = singleMoim.getSessionList();
		System.out.println("abc : " + abc.get(0)+"현재아이디 : "+session.getId());		
		
		//sessionList.add(session);
		System.out.println(dto.getUserid()+" 가 입장하였습니다.");
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		
		sessionList = singleMoim.getSessionList();
		
		for(WebSocketSession sess: sessionList) {
			sess.sendMessage(new TextMessage(dto.getUserid()+" : "+message.getPayload()));
		}
		System.out.println(dto.getUserid()+" 가 보낸 매세지[" + message.getPayload()+"]");

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		singleMoim.getSessionList().remove(session);
		System.out.println(session.getId()+"가 나가셨습니다.");
	}
	
	// 웹소켓 서버측에 텍스트 메시지가 접수되면 호출되는 메소드
 /*   @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String payloadMessage = (String) message.getPayload();
        System.out.println("서버에 도착한 메시지:"+payloadMessage);
        for(WebSocketSession sess : sessionList) {
        	session.sendMessage(new TextMessage(session.getId()+" : " + payloadMessage));
        }
        Map<String, Object> map = session.getAttributes();
        GroupUserDto dto = (GroupUserDto)map.get("dto");
        System.out.println("전송자 아이디:"+dto.getUserid());
    }*/
    
    // 메시지 전송시나 접속해제시 오류가 발생할 때 호출되는 메소드
    @Override
    public void handleTransportError(WebSocketSession session,
            Throwable exception) throws Exception {
        super.handleTransportError(session, exception);
        System.out.println("전송오류 발생");
    }



	
	
}
