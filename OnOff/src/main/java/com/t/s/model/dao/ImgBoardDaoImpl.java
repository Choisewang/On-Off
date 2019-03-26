package com.t.s.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t.s.model.dto.ImgBoardDto;

@Repository
public class ImgBoardDaoImpl implements ImgBoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<ImgBoardDto> selectImgBoardList(int groupno) {
		
		List<ImgBoardDto> list = new ArrayList<ImgBoardDto>();
		
		list = sqlSession.selectList(NAMESPACE+"imgboardlist", groupno);
		
		return list;
	}

	@Override
	public ImgBoardDto selectImgBoardDetail(int imgboardno) {
		
		ImgBoardDto res = new ImgBoardDto();
		
		res = sqlSession.selectOne(NAMESPACE+"imgboarddetail", imgboardno);
		
		return res;
	}

	@Override
	public int insertImgBoard(ImgBoardDto imgboarddto) {
		
		int res = 0;
		res = sqlSession.insert(NAMESPACE+"imgBoardInsert",imgboarddto);
		
		return res;
	}

}
