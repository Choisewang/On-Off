package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.UserDao;

@Service
public class UserBizImpl implements UserBiz {
	
	@Autowired
	private UserDao dao;

}
