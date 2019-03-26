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
		
		dtoResult = sqlSession.selectOne(NAMESPACE+"selGroupnoGroupuser", dto);
		
		if(dtoResult == null) {
			System.out.println("아무것도 없음");
		}
		
		return dtoResult;
	}

	@Override
	public int groupInUser(GroupUserDto groupuserdto) {
		int res = 0;
		
		res = sqlSession.insert(NAMESPACE+"groupInUser",groupuserdto);
		
		return res;
	}

}
