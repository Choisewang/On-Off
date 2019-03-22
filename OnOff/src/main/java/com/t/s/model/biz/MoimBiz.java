package com.t.s.model.biz;

import java.util.List;

import com.t.s.model.dto.MoimDto;

public interface MoimBiz {

	public int insertMoim(MoimDto moimdto);
	
	public MoimDto selectMoim(int num);
	
	public List<MoimDto> selectMoimList();
	
	
}
