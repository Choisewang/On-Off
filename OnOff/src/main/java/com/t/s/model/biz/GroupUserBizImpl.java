package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.GroupUserDao;
import com.t.s.model.dto.GroupUserDto;

@Service
public class GroupUserBizImpl implements GroupUserBiz {
	
	@Autowired
	private GroupUserDao dao;

	@Override
	public GroupUserDto selGroupnoGroupuser(GroupUserDto dto) {
		return dao.selGroupnoGroupuser(dto);
	}

}
