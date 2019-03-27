package com.t.s.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.FreeBoardDao;
import com.t.s.model.dto.FreeBoardDto;

@Service
public class FreeBoardBizImpl implements FreeBoardBiz {
	
	@Autowired
	private FreeBoardDao dao;

	@Override
	public List<FreeBoardDto> selectFreeBoardList(int groupno) {
		// TODO Auto-generated method stub
		return dao.selectFreeBoardList(groupno);
	}

	@Override
	public FreeBoardDto selectFreeBoardDetail(int boardno) {
		// TODO Auto-generated method stub
		return dao.selectFreeBoardDetail(boardno);
	}

	@Override
	public int insertFreeBoard(FreeBoardDto freeboarddto) {
		// TODO Auto-generated method stub
		return dao.insertFreeBoard(freeboarddto);
	}

	@Override
	public int updateFreeBoard(FreeBoardDto freeboarddto) {
		// TODO Auto-generated method stub
		return dao.updateFreeBoard(freeboarddto);
	}

	@Override
	public int deleteFreeBoard(int boardno) {
		// TODO Auto-generated method stub
		return dao.deleteFreeBoard(boardno);
	}

}
