package com.t.s.model.dao;

import com.t.s.model.dto.MoimUserDto;

public interface MoimUserDao {
	
	String NAMESPACE = "onoff.";

	// 아래에는 기능만
	// public List<CustomerDto> selectList(); 이런식으로만
	public int survey(MoimUserDto dto);
	public double avgQ1(MoimUserDto dto);
	public double avgQ2(MoimUserDto dto);
	public double avgQ3(MoimUserDto dto);
	public double avgQ4(MoimUserDto dto);
	public double avgQ5(MoimUserDto dto);
	
}
