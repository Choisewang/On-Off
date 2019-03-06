package com.dao;

import java.util.List;

import com.dto.MyDto_IC;

public interface Dao_IC {
	
	String selectListSql=" SELECT * FROM I_COMMENT ";
	String updateSql=" UPDATE I_COMMENT SET IC_WRITE = ?  WHERE IC_NO = ? ";
	String deleteSql=" DELETE FORM I_COMMENT WHERE IC_NO = ? ";
	String insertSql=" INSERT INTO I_COMMENT "+" VALUES(IC_NO.NEXTVAL,?,?,?,?,?,SYSDATE) ";
	
	public List<MyDto_IC> selectList();
	public int insert(MyDto_IC dto);
	public int update(MyDto_IC dto);
	public int delete(int no);

}
