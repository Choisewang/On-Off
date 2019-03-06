package com.dao;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MyDto_R;

public class R_Impl implements Dao_R {

	@Override
	public List<MyDto_R> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyDto_R> list = new ArrayList<MyDto_R>();		
		try {
			pstm = con.prepareStatement(selectListSql);
			System.out.println("03.query 준비 "+ selectListSql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MyDto_R dto = new MyDto_R();
				dto.setM_no(rs.getInt(1));
				dto.setU_no(rs.getInt(2));
				dto.setG_no(rs.getInt(3));
				dto.setContent(rs.getString(4));
				dto.setStar(rs.getInt(5));
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
	public int insert(MyDto_R dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			
			pstm.setInt(1, dto.getM_no());
			pstm.setInt(2, dto.getU_no());
			pstm.setInt(3, dto.getG_no());
			pstm.setString(4, dto.getContent());
			pstm.setInt(4, dto.getStar());
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
	public int update(MyDto_R dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(insertSql);
			pstm.setString(1, dto.getContent());
			pstm.setInt(2, dto.getStar());
			pstm.setInt(3, dto.getM_no());
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
	public int delete(int m_no, int u_no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(deleteSql);
			pstm.setInt(1, m_no);
			pstm.setInt(2, u_no);
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
