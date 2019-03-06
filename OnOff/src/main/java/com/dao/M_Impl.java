package com.dao;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MyDto_M;

public class M_Impl implements Dao_M {

	@Override
	public List<MyDto_M> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyDto_M> list = new ArrayList<MyDto_M>();		
		try {
			pstm = con.prepareStatement(selectListSql);
			System.out.println("03.query 준비 "+ selectListSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MyDto_M dto = new MyDto_M();
				dto.setM_no(rs.getInt(1));
				dto.setU_no(rs.getInt(2));
				dto.setG_no(rs.getInt(3));
				dto.setTitle(rs.getString(4));
				dto.setNp(rs.getString(5));
				dto.setCom(rs.getString(6));
				dto.setLo(rs.getString(7));
				dto.setCd(rs.getDate(8));
				dto.setEd(rs.getDate(9));
				dto.setMd(rs.getDate(10));
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
	public MyDto_M selectOne(int no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyDto_M dto = new MyDto_M();
		try {
			pstm = con.prepareStatement(selectOneSql);
			pstm.setInt(1, no);
			System.out.println("03.query 준비 "+ selectOneSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				dto.setM_no(rs.getInt(1));
				dto.setU_no(rs.getInt(2));
				dto.setG_no(rs.getInt(3));
				dto.setTitle(rs.getString(4));
				dto.setNp(rs.getString(5));
				dto.setCom(rs.getString(6));
				dto.setLo(rs.getString(7));
				dto.setCd(rs.getDate(8));
				dto.setEd(rs.getDate(9));
				dto.setMd(rs.getDate(10));
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
	public int insert(MyDto_M dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setInt(1, dto.getU_no());
			pstm.setInt(2, dto.getG_no());
			pstm.setString(3, dto.getTitle());
			pstm.setString(4, dto.getNp());
			pstm.setString(5, dto.getCom());
			pstm.setString(6, dto.getLo());
			pstm.setDate(7, (Date)dto.getEd());
			pstm.setDate(8, (Date)dto.getMd());
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
	public int update(MyDto_M dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getCom());
			pstm.setString(3, dto.getLo());
			pstm.setDate(4, (Date)dto.getEd());
			pstm.setDate(5, (Date)dto.getMd());
			pstm.setInt(6, dto.getM_no());
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
