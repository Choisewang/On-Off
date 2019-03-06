package com.dao;

import java.util.List;

import com.dto.MyDto_I;

public interface Dao_I {
	

	String selectListSql=" SELECT * FROM I_INFO ";
	String selectOneSql=" SELECT * FROM I_INFO WHERE I_NO = ? ";
	String updateSql=" UPDATE I_INFO SET I_TITLE = ?, I_CONTENT = ?  WHERE I_NO = ? ";
	String deleteSql=" DELETE FORM I_INFO WHERE I_NO = ? ";
	String insertSql=" INSERT INTO I_INFO "+" VALUES(I_NO.NEXTVAL,?,?,?,?,?,SYSDATE) ";
	
	public List<MyDto_I> selectList();
	public MyDto_I selectOne(int no);
	public int insert(MyDto_I dto);
	public int update(MyDto_I dto);
	public int delete(int no);

}
