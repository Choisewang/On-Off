package com.t.s.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.t.s.model.dao.MoimDao;
import com.t.s.model.dto.MoimDto;

@Service
public class MoimBizImpl implements MoimBiz {
	
	@Autowired
	private MoimDao dao;

	@Override
	public int insertMoim(MoimDto moimdto) {
		System.out.println("비즈옴옴");
		return dao.insertMoim(moimdto);
	}

	@Override
	public MoimDto selectMoim(int num) {
		// TODO Auto-generated method stub
		return dao.selectMoim(num);
	}

	@Override
	public List<MoimDto> selectMoimList() {
		return dao.selectMoimList();
	}

}
