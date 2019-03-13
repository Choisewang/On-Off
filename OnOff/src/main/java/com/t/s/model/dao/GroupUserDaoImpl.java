package com.t.s.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GroupUserDaoImpl implements GroupUserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

}
