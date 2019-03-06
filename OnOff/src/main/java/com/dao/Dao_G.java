package com.dao;

import java.util.List;

import com.dto.MyDto_G;

public interface Dao_G {
	
	String selectListSql=" SELECT * FROM G_INFO ";
	String selectOneSql=" SELECT * FROM G_INFO WHERE G_NO = ? ";
	String updateSql=" UPDATE G_INFO SET G_TITLE = ?, G_COM = ?, G_IMG = ? WHERE G_NO = ? ";
	String deleteSql=" DELETE FORM G_INFO WHERE G_NO = ? ";
	String insertSql=" INSERT INTO G_INFO "+" VALUES(G_NO.NEXTVAL,?,?,SYSDATE,?) ";
	
	public List<MyDto_G> selectList();
	public MyDto_G selectOne(int no);
	public int insert(MyDto_G dto);
	public int update(MyDto_G dto);
	public int delete(int no);

}
