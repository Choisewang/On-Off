package com.t.s.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t.s.model.dao.MoimUserDao;
import com.t.s.model.dto.MoimUserDto;

@Service
public class MoimUserBizImpl implements MoimUserBiz {
	
	@Autowired
	private MoimUserDao dao;

	@Override
	public int survey(MoimUserDto dto) {
		return dao.survey(dto);
	}

}
