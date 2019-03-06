package com.dao;

import java.util.List;

import com.dto.MyDto_P;

public interface Dao_P {
	
	String selectListSql=" SELECT * FROM P_INFO ";
	String updateSql=" UPDATE P_INFO SET P_GRADE = ? WHERE U_NO = ? AND G_NO = ?";
	String deleteSql=" DELETE FORM P_INFO WHERE U_NO = ? AND G_NO = ? ";
	String insertSql=" INSERT INTO P_INFO "+" VALUES(?,?,?,SYSDATE) ";
	
	public List<MyDto_P> selectList();
	public int insert(MyDto_P dto);
	public int update(MyDto_P dto);
	public int delete(int u_no, int g_no);

}
