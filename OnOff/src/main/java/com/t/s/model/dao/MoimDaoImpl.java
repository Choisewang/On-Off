package com.t.s.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t.s.model.dto.MoimDto;

@Repository
public class MoimDaoImpl implements MoimDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertMoim(MoimDto moimdto) {
		
		System.out.println("다오옴");
		int res = 0;
		
		try {
			res=sqlSession.insert(NAMESPACE+"insertMoim",moimdto);
		} catch (Exception e) {
			System.out.println("insertmoim 에러");
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public MoimDto selectMoim(int num) {
		
		MoimDto res = new MoimDto();
		
		try {
			res = sqlSession.selectOne(NAMESPACE+"selectOneMoim",num);
		} catch (Exception e) {
			System.out.println("selectOneMoim 에러");
			e.printStackTrace();
		}
		
		
		return res;
	}

	@Override
	public List<MoimDto> selectMoimList() {

		List<MoimDto> list = new ArrayList<MoimDto>();
		
		list = sqlSession.selectList(NAMESPACE+"selectAllMoim");
		
		return list;
	}

	
	
	
	
	
}
