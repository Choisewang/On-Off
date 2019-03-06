package com.dao;

import java.util.List;

import com.dto.MyDto_R;

public interface Dao_R {
	
	String selectListSql=" SELECT * FROM R_INFO ";
	String updateSql=" UPDATE R_INFO SET R_CONTENT = ?, R_STAR = ? WHERE M_NO = ? AND U_NO = ? ";
	String deleteSql=" DELETE FORM R_INFO WHERE M_NO = ? AND U_NO = ? ";
	String insertSql=" INSERT INTO R_INFO "+" VALUES(?,?,?,?,?) ";
	
	public List<MyDto_R> selectList();
	public int insert(MyDto_R dto);
	public int update(MyDto_R dto);
	public int delete(int m_no, int u_no);

}
