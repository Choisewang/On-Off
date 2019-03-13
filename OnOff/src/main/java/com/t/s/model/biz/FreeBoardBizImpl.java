package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.FreeBoardDao;

@Service
public class FreeBoardBizImpl implements FreeBoardBiz {
	
	@Autowired
	private FreeBoardDao dao;

}
