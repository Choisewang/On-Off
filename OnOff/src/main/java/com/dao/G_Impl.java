package com.dao;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dto.MyDto_G;

public class G_Impl implements Dao_G {

	@Override
	public List<MyDto_G> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyDto_G> list = new ArrayList<MyDto_G>();		
		try {
			pstm = con.prepareStatement(selectListSql);
			System.out.println("03.query 준비 "+ selectListSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MyDto_G dto = new MyDto_G();
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setCom(rs.getString(3));
				dto.setDate(rs.getDate(4));
				dto.setImg(rs.getString(5));
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
	public MyDto_G selectOne(int no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyDto_G dto = new MyDto_G();
		try {
			pstm = con.prepareStatement(selectOneSql);
			pstm.setInt(1, no);
			System.out.println("03.query 준비 "+ selectOneSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setCom(rs.getString(3));
				dto.setDate(rs.getDate(4));
				dto.setImg(rs.getString(5));
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
	public int insert(MyDto_G dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getCom());
			pstm.setString(3, dto.getImg());
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
	public int update(MyDto_G dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(updateSql);
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getCom());
			pstm.setString(3, dto.getImg());
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
