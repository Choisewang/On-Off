package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.ImgBoardAnsDao;

@Service
public class ImgBoardAnsBizImpl implements ImgBoardAnsBiz {
	
	@Autowired
	private ImgBoardAnsDao dao;

}
