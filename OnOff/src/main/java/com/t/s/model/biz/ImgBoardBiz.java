package com.t.s.model.biz;

import java.util.List;

import com.t.s.model.dto.ImgBoardDto;


public interface ImgBoardBiz {

	public List<ImgBoardDto> selectImgBoardList(int groupno);
	public ImgBoardDto selectImgBoardDetail(int imgboardno);
	public int insertImgBoard(ImgBoardDto imgboarddto);
}
