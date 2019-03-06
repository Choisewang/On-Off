package com.dao;

import java.util.List;

import com.dto.MyDto_M;

public interface Dao_M {
	
	String selectListSql=" SELECT * FROM M_INFO ";
	String selectOneSql=" SELECT * FROM M_INFO WHERE M_NO = ? ";
	String updateSql=" UPDATE M_INFO SET M_TITLE = ?, M_COM = ?, M_LO =?, M_ED=?, M_MD=?  WHERE M_NO = ? ";
	String deleteSql=" DELETE FORM M_INFO WHERE M_NO = ? ";
	String insertSql=" INSERT INTO M_INFO "+" VALUES(M_NO.NEXTVAL,?,?,?,?,?,?,SYSDATE,?,?) ";
	
	public List<MyDto_M> selectList();
	public MyDto_M selectOne(int no);
	public int insert(MyDto_M dto);
	public int update(MyDto_M dto);
	public int delete(int no);


}
