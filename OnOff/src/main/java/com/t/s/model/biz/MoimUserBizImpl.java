package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.MoimUserDao;

@Service
public class MoimUserBizImpl implements MoimUserBiz {
	
	@Autowired
	private MoimUserDao dao;

}
