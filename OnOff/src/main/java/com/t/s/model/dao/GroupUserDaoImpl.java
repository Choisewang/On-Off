package com.t.s.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t.s.model.dto.GroupUserDto;

@Repository
public class GroupUserDaoImpl implements GroupUserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public GroupUserDto selGroupnoGroupuser(GroupUserDto dto) {
		GroupUserDto dtoResult = new GroupUserDto();
		dto = sqlSession.selectOne(NAMESPACE+"selGroupnoGroupuser", dto);
		return dto;
	}

}
