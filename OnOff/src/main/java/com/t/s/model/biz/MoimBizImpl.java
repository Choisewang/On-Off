package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.t.s.model.dao.MoimDao;

@Service
public class MoimBizImpl implements MoimBiz {
	
	@Autowired
	private MoimDao dao;

}
