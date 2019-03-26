package com.t.s.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t.s.model.dto.FreeBoardDto;

@Repository
public class FreeBoardDaoImpl implements FreeBoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<FreeBoardDto> selectFreeBoardList(int groupno) {
		
		List<FreeBoardDto> list = new ArrayList<FreeBoardDto>();
		
		list = sqlSession.selectList(NAMESPACE+"freeboardlist",groupno);
		
		return list;
	}

	@Override
	public FreeBoardDto selectFreeBoardDetail(int boardno) {
		
		FreeBoardDto res = new FreeBoardDto();
		
		res = sqlSession.selectOne(NAMESPACE+"freeboarddetail", boardno);
		
		return res;
	}

	@Override
	public int insertFreeBoard(FreeBoardDto freeboarddto) {
		
		int res = 0;
		
		res = sqlSession.insert(NAMESPACE+"freeBoardInsert",freeboarddto);
		
		return res;
	}

}
