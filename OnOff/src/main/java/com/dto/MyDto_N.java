package com.dto;

import java.util.Date;

public class MyDto_N {
	
	private int n_no;
	private String u_id;
	private int g_no;
	private String title;
	private String content;
	private Date date;
	@Override
	public String toString() {
		return "MyDto_N [n_no=" + n_no + ", u_id=" + u_id + ", g_no=" + g_no + ", title=" + title + ", content="
				+ content + ", date=" + date + "]";
	}
	public MyDto_N(int n_no, String u_id, int g_no, String title, String content, Date date) {
		super();
		this.n_no = n_no;
		this.u_id = u_id;
		this.g_no = g_no;
		this.title = title;
		this.content = content;
		this.date = date;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public MyDto_N() {
		super();
	}
	

}
