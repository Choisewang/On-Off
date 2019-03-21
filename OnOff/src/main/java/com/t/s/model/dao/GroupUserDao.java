package com.t.s.model.dao;

import com.t.s.model.dto.GroupUserDto;

public interface GroupUserDao {
	
	String NAMESPACE = "onoff.";

	// 아래에는 기능만
	// public List<CustomerDto> selectList(); 이런식으로만
	public GroupUserDto selGroupnoGroupuser(GroupUserDto dto);
}
