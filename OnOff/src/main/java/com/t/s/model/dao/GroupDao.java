package com.t.s.model.dao;

import com.t.s.model.dto.GroupDto;

public interface GroupDao {
	
	String NAMESPACE = "onoff.";

	// 그룹 디테일
	public GroupDto selectGroupDetail(int groupno);
	
	// 그룹 생성
	public int insertGroup(GroupDto groupdto);
	// 그룹 생성 후 no 찾기
	public int findGroupNo(String fineImg);
	
}
