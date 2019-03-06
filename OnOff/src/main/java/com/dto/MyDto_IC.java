package com.dto;

import java.util.Date;

public class MyDto_IC {
	
	private int c_no;
	private int i_no;
	public int getI_no() {
		return i_no;
	}
	public void setI_no(int i_no) {
		this.i_no = i_no;
	}
	private int m_no;
	private int u_no;	
	private int g_no;
	private String write;
	private Date date;
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
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
		return "MyDto_IC [c_no=" + c_no + ", m_no=" + m_no + ", u_no=" + u_no + ", g_no=" + g_no + ", write=" + write
				+ ", date=" + date + "]";
	}
	
	public MyDto_IC(int c_no, int i_no, int m_no, int u_no, int g_no, String write, Date date) {
		super();
		this.c_no = c_no;
		this.i_no = i_no;
		this.m_no = m_no;
		this.u_no = u_no;
		this.g_no = g_no;
		this.write = write;
		this.date = date;
	}
	public MyDto_IC() {
		super();
	}
	

}
