package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.ImgBoardDao;

@Service
public class ImgBoardBizImpl implements ImgBoardBiz {
	
	@Autowired
	private ImgBoardDao dao;

}
