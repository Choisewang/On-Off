package com.chat.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.t.s.model.biz.SessionIdsBiz;
import com.t.s.model.dto.GroupUserDto;
import com.t.s.model.dto.SessionIds;


public class EchoHandler extends TextWebSocketHandler {

	//private Map<SessionIds, WebSocketSession> sessionList = new HashMap<>();
	
	private Map<Integer, SingleMoim> moims = new HashMap<Integer, SingleMoim>();
	
	SingleMoim singleMoim = new SingleMoim();
	
	GroupUserDto dto = new GroupUserDto();
	// 웹소켓 서버에 클라이언트가 접속하면 호출되는 메소드
	
	@Autowired
	SessionIdsBiz biz;
	//아이디 저장하고 불러오고 해야할 biz
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		Map<String, Object> map = session.getAttributes();
		dto = (GroupUserDto)map.get("groupUserdto"); //아이디랑 그룹넘버 불러옴
		
		
		SessionIds ids = new SessionIds();
		ids.setSessionid(session.getId());
		System.out.println(session.getId()+" : 들어가는 sessionid");
		ids.setUserid(dto.getUserid());
		System.out.println(dto.getUserid()+" : 들어가는 userid");
		
		singleMoim.addSession(ids, session);
		
		moims.put(dto.getGroupno(), singleMoim);
		
		//잘들어가 있는지 확인용
		/*System.out.println(singleMoim.findSession(ids)+" : 현재 아이디");
		System.out.println(dto.getGroupno()+" : groupnum임");
		System.out.println(moims.get(dto.getGroupno()).getSessionMap()+"들어가는있값이 무엇인지 보자");*/
				
		//sessionList.add(session);
		System.out.println(dto.getUserid()+" 가 입장하였습니다.");

		int res = 0;
        res = biz.insertIds(ids);
        
        if(res != 0) {
        	System.out.println("sessionids 잘 들어갔음");
        }

	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		
		SingleMoim s = null;
		
		for(Map.Entry<Integer, SingleMoim> presentGroup : moims.entrySet()) {
			if(presentGroup.getKey() == dto.getGroupno()) {
				s = presentGroup.getValue();
				break;
			}
		}
		
		for(Map.Entry<SessionIds, WebSocketSession> entry : s.getSessionMap().entrySet()) {
			
			entry.getValue().sendMessage(new TextMessage(biz.selectOne(session.getId()).getUserid()+" : "+message.getPayload()));
		}
		System.out.println(session.getId()+" 가 보낸 매세지[" + message.getPayload()+"]");

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		//singleMoim.getSessionMap().get(session);
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
