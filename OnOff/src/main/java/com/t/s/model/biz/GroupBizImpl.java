package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.GroupDao;

@Service
public class GroupBizImpl implements GroupBiz {
	
	@Autowired
	private GroupDao dao;

}
