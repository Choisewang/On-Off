package com.dao;

import java.util.List;

import com.dto.MyDto_U;


public interface Dao_U {
	
	String selectListSql=" SELECT * FROM U_INFO ";
	String selectOneSql=" SELECT * FROM U_INFO WHERE U_NO = ? ";
	String updateSql=" UPDATE U_INFO SET U_IMG= ?, U_PHONE = ?, U_LO = ? WHERE U_NO = ? ";
	String deleteSql=" DELETE FORM U_INFO WHERE U_NO = ? ";
	String insertSql=" INSERT INTO U_INFO "+" VALUES(U_NO.NEXTVAL,?,?,?,?,?,?,?,?,?,SYSDATE,?) ";
	
	public List<MyDto_U> selectList();
	public MyDto_U selectOne(int no);
	public int insert(MyDto_U dto);
	public int update(MyDto_U dto);
	public int delete(int boardno);

}
