package com.dao;

import java.util.List;

import com.dto.MyDto_MC;

public interface Dao_MC {
	
	String selectListSql=" SELECT * FROM M_COMMENT ";
	String updateSql=" UPDATE M_COMMENT SET MC_WRITE = ?  WHERE MC_NO = ? ";
	String deleteSql=" DELETE FORM M_COMMENT WHERE MC_NO = ? ";
	String insertSql=" INSERT INTO M_COMMENT "+" VALUES(MC_NO.NEXTVAL,?,?,?,?,SYSDATE) ";
	
	public List<MyDto_MC> selectList();
	public int insert(MyDto_MC dto);
	public int update(MyDto_MC dto);
	public int delete(int no);

}
