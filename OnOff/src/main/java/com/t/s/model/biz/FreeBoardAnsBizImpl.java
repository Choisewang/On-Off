package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.FreeBoardAnsDao;

@Service
public class FreeBoardAnsBizImpl implements FreeBoardAnsBiz {
	
	@Autowired
	private FreeBoardAnsDao dao;

}
