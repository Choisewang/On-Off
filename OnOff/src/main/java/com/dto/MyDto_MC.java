package com.dto;

import java.util.Date;

public class MyDto_MC {
	
	private int c_no;
	private int i_no;
	private int m_no;
	private String u_id;	
	private int g_no;
	private String write;
	private Date date;
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public int getI_no() {
		return i_no;
	}
	public void setI_no(int i_no) {
		this.i_no = i_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
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
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MyDto_MC [c_no=" + c_no + ", i_no=" + i_no + ", m_no=" + m_no + ", u_id=" + u_id + ", g_no=" + g_no
				+ ", write=" + write + ", date=" + date + "]";
	}
	public MyDto_MC(int c_no, int i_no, int m_no, String u_id, int g_no, String write, Date date) {
		super();
		this.c_no = c_no;
		this.i_no = i_no;
		this.m_no = m_no;
		this.u_id = u_id;
		this.g_no = g_no;
		this.write = write;
		this.date = date;
	}
	public MyDto_MC() {
		super();
	}
	
	

}
