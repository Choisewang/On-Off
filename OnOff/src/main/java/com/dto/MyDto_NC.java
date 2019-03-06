package com.dto;

import java.util.Date;

public class MyDto_NC {
	
	private int c_no;
	private int n_no;
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
	public int getN_no() {
		return n_no;
	}
	public void setN_no(int n_no) {
		this.n_no = n_no;
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
	public MyDto_NC(int c_no, int n_no, int u_no, int g_no, String write, Date date) {
		super();
		this.c_no = c_no;
		this.n_no = n_no;
		this.u_no = u_no;
		this.g_no = g_no;
		this.write = write;
		this.date = date;
	}
	public MyDto_NC() {
		super();
	}

}
