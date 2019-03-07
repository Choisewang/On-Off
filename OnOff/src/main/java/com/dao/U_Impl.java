package com.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.dto.MyDto_U;


public class U_Impl implements Dao_U {
	
	

	@Override
	public List<MyDto_U> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyDto_U> list = new ArrayList<MyDto_U>();		
		try {
			pstm = con.prepareStatement(selectListSql);
			System.out.println("03.query 준비 "+ selectListSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MyDto_U dto = new MyDto_U();
				dto.setNo(rs.getInt(1));
				dto.setGrade(rs.getString(2));
				dto.setId(rs.getString(3));
				dto.setPw(rs.getString(4));
				dto.setName(rs.getString(5));
				dto.setAge(rs.getInt(6));
				dto.setMail(rs.getString(7));
				dto.setLo(rs.getString(8));
				dto.setGen(rs.getString(9));
				dto.setPhone(rs.getInt(10));
				dto.setDate(rs.getDate(11));
				dto.setImg(rs.getString(12));		
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("3/4단계에러");
		}finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05.db 종료");
		}		
		return list;
	}

	@Override
	public MyDto_U selectOne(int no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyDto_U dto = new MyDto_U();
		try {
			pstm = con.prepareStatement(selectOneSql);
			pstm.setInt(1, no);
			System.out.println("03.query 준비 "+ selectOneSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				dto.setNo(rs.getInt(1));
				dto.setGrade(rs.getString(2));
				dto.setId(rs.getString(3));
				dto.setPw(rs.getString(4));
				dto.setName(rs.getString(5));
				dto.setAge(rs.getInt(6));
				dto.setMail(rs.getString(7));
				dto.setLo(rs.getString(8));
				dto.setGen(rs.getString(9));
				dto.setPhone(rs.getInt(10));
				dto.setDate(rs.getDate(11));
				dto.setImg(rs.getString(12));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("3/4단계에러");
		}finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05.db 종료");
		}		
		return dto;
	}

	@Override
	public int insert(MyDto_U dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setString(1, dto.getGrade());
			pstm.setString(2, dto.getId());
			pstm.setString(3, dto.getPw());
			pstm.setString(4, dto.getName());
			pstm.setInt(5, dto.getAge());
			pstm.setString(6, dto.getMail());
			pstm.setString(7, dto.getLo());
			pstm.setString(8, dto.getGen());
			pstm.setInt(9, dto.getPhone());
			pstm.setString(10, dto.getImg());
			System.out.println("03.query 준비 "+ insertSql);
			res = pstm.executeUpdate();
			System.out.println("04.query 실행 및 리턴");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("3/4단계에러");
		}finally {
			close(pstm);
			close(con);
			System.out.println("05.db 종료");
		}		
		return res;
	}

	@Override
	public int update(MyDto_U dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(updateSql);
			pstm.setString(1, dto.getGrade());
			pstm.setInt(2, dto.getPhone());
			pstm.setString(3, dto.getLo());
			pstm.setInt(4, dto.getNo());
			System.out.println("03.query 준비 "+ updateSql);
			res = pstm.executeUpdate();
			System.out.println("04.query 실행 및 리턴");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("3/4단계에러");
		}finally {
			close(pstm);
			close(con);
			System.out.println("05.db 종료");
		}		
		return res;
	}

	@Override
	public int delete(int no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(deleteSql);
			pstm.setInt(1, no);
			System.out.println("03.query 준비 "+ deleteSql);
			res = pstm.executeUpdate();
			System.out.println("04.query 실행 및 리턴");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("3/4단계에러");
		}finally {
			close(pstm);
			close(con);
			System.out.println("05.db 종료");
		}		
		return res;
	}

}
