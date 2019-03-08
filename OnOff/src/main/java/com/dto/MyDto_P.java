package com.dto;

import java.util.Date;

public class MyDto_P {
	
	private String u_id;
	private int g_no;
	private String grade;
	private Date date;
	public String getu_id() {
		return u_id;
	}
	public void setu_id(String u_id) {
		this.u_id = u_id;
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
		return "MyDto_P [u_id=" + u_id + ", g_no=" + g_no + ", grade=" + grade + ", date=" + date + "]";
	}
	public MyDto_P(String u_id, int g_no, String grade, Date date) {
		super();
		this.u_id = u_id;
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
