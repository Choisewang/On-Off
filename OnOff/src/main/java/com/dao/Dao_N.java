package com.dao;

import java.util.List;

import com.dto.MyDto_N;

public interface Dao_N {
	
	String selectListSql=" SELECT * FROM N_INFO ";
	String selectOneSql=" SELECT * FROM N_INFO WHERE N_NO = ? ";
	String updateSql=" UPDATE N_INFO SET N_TITLE = ?, N_CONTENT = ? WHERE N_NO = ? ";
	String deleteSql=" DELETE FORM N_INFO WHERE N_NO = ? ";
	String insertSql=" INSERT INTO N_INFO "+" VALUES(N_NO.NEXTVAL,?,?,?,?,SYSDATE) ";
	
	public List<MyDto_N> selectList();
	public MyDto_N selectOne(int no);
	public int insert(MyDto_N dto);
	public int update(MyDto_N dto);
	public int delete(int no);

}
