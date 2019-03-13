package com.t.s.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImgBoardDaoImpl implements ImgBoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

}
