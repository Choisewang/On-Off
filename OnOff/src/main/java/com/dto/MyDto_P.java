package com.dto;

import java.util.Date;

public class MyDto_P {
	
	private int u_no;
	private int g_no;
	private String grade;
	private Date date;
	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	public int getG_no() {
		return g_no;
	}
	public void setG_no(int g_no) {
		this.g_no = g_no;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MyDto_P [u_no=" + u_no + ", g_no=" + g_no + ", grade=" + grade + ", date=" + date + "]";
	}
	public MyDto_P(int u_no, int g_no, String grade, Date date) {
		super();
		this.u_no = u_no;
		this.g_no = g_no;
		this.grade = grade;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public MyDto_P() {
		super();
	}
	

}
