package com.t.s.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.ImgBoardDao;
import com.t.s.model.dto.ImgBoardDto;

@Service
public class ImgBoardBizImpl implements ImgBoardBiz {
	
	@Autowired
	private ImgBoardDao dao;

	@Override
	public List<ImgBoardDto> selectImgBoardList(int groupno) {
		// TODO Auto-generated method stub
		return dao.selectImgBoardList(groupno);
	}

	@Override
	public ImgBoardDto selectImgBoardDetail(int imgboardno) {
		// TODO Auto-generated method stub
		return dao.selectImgBoardDetail(imgboardno);
	}

	@Override
	public int insertImgBoard(ImgBoardDto imgboarddto) {
		// TODO Auto-generated method stub
		return dao.insertImgBoard(imgboarddto);
	}

}
