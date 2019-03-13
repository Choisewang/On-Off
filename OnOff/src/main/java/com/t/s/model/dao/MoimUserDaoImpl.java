package com.t.s.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MoimUserDaoImpl implements MoimUserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

}
