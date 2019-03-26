package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.GroupDao;
import com.t.s.model.dto.GroupDto;

@Service
public class GroupBizImpl implements GroupBiz {
	
	@Autowired
	private GroupDao dao;

	@Override
	public GroupDto selectGroupDetail(int groupno) {
		return dao.selectGroupDetail(groupno);
	}

	@Override
	public int insertGroup(GroupDto groupdto) {
		return dao.insertGroup(groupdto);
	}

	@Override
	public int findGroupNo(String fineImg) {
		return dao.findGroupNo(fineImg);
	}

}
