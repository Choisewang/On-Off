package common;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTemplate {
	
	public static Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("01.driver 계정연결");
		} catch (ClassNotFoundException e) {
			System.out.println("01.driver 계정연결 실패");
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="kh";
		String pw="kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("02.계졍연결 성공");
			con.setAutoCommit(false);
			
		} catch (SQLException e) {
			System.out.println("02.계정연결 실패");
			e.printStackTrace();
		}
		
		return con;
	}
	public static boolean isConnection(Connection con) {
		boolean valid = true;
		
		try {
			if(con==null || con.isClosed()) {
				valid = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			valid = true;
		}
		
		return valid;
	}
	
	
	public static void close(Connection con) {
		if(isConnection(con)) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void commit(Connection con) {
		if(isConnection(con)) {
			try {
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public static void rollback(Connection con) {
		if(isConnection(con)) {
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
}
