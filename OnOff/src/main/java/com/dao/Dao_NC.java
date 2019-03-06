package com.dao;

import java.util.List;

import com.dto.MyDto_NC;

public interface Dao_NC {
	
	String selectListSql=" SELECT * FROM N_COMMENT ";
	String updateSql=" UPDATE N_COMMENT SET C_WRITE = ?  WHERE NC_NO = ? ";
	String deleteSql=" DELETE FORM N_COMMENT WHERE NC_NO = ? ";
	String insertSql=" INSERT INTO N_COMMENT "+" VALUES(NC_NO.NEXTVAL,?,?,?,?,SYSDATE) ";
	
	public List<MyDto_NC> selectList();
	public int insert(MyDto_NC dto);
	public int update(MyDto_NC dto);
	public int delete(int no);

}
