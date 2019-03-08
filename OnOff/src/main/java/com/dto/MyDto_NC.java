package com.dto;

import java.util.Date;

public class MyDto_NC {
	
	private int c_no;
	private int n_no;
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
	public int getN_no() {
		return n_no;
	}
	public void setN_no(int n_no) {
		this.n_no = n_no;
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
	public MyDto_NC(int c_no, int n_no, String u_id, int g_no, String write, Date date) {
		super();
		this.c_no = c_no;
		this.n_no = n_no;
		this.u_id = u_id;
		this.g_no = g_no;
		this.write = write;
		this.date = date;
	}
	public MyDto_NC() {
		super();
	}

}
