package com.t.s.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t.s.model.dto.MoimUserDto;

@Repository
public class MoimUserDaoImpl implements MoimUserDao {
	
	
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int survey(MoimUserDto dto) {
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE+"survey",dto);
		}catch (Exception e) {
			System.out.println("survey insert error");
			e.printStackTrace();
		}
		return res;
	}

}
