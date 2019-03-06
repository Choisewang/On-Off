package com.dao;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MyDto_N;

public class N_Impl implements Dao_N {

	@Override
	public List<MyDto_N> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyDto_N> list = new ArrayList<MyDto_N>();		
		try {
			pstm = con.prepareStatement(selectListSql);
			System.out.println("03.query 준비 "+ selectListSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MyDto_N dto = new MyDto_N();
				dto.setN_no(rs.getInt(1));
				dto.setU_no(rs.getInt(2));
				dto.setG_no(rs.getInt(3));
				dto.setTitle(rs.getString(4));
				dto.setContent(rs.getString(5));
				dto.setDate(rs.getDate(6));
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
	public MyDto_N selectOne(int no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyDto_N dto = new MyDto_N();
		try {
			pstm = con.prepareStatement(selectOneSql);
			pstm.setInt(1, no);
			System.out.println("03.query 준비 "+ selectOneSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				dto.setN_no(rs.getInt(1));
				dto.setU_no(rs.getInt(2));
				dto.setG_no(rs.getInt(3));
				dto.setTitle(rs.getString(4));
				dto.setContent(rs.getString(5));
				dto.setDate(rs.getDate(6));
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
	public int insert(MyDto_N dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setInt(1, dto.getU_no());
			pstm.setInt(2, dto.getG_no());
			pstm.setString(3, dto.getTitle());
			pstm.setString(4, dto.getContent());
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
	public int update(MyDto_N dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(updateSql);
			pstm.setString(1, dto.getTitle());
			pstm.setString(1, dto.getContent());
			pstm.setInt(3, dto.getN_no());
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
