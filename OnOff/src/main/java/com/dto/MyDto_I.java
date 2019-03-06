package com.dto;

import java.util.Date;

public class MyDto_I {
	
	private int i_no;
	private int m_no;
	private int u_no;
	private int g_no;
	public MyDto_I() {
		super();
	}
	private String title;
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
	private String content;
	private Date date;
	public MyDto_I(int i_no, int m_no, int u_no, int g_no, String title, String content, Date date) {
		super();
		this.i_no = i_no;
		this.m_no = m_no;
		this.u_no = u_no;
		this.g_no = g_no;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	@Override
	public String toString() {
		return "MyDto_I [i_no=" + i_no + ", m_no=" + m_no + ", u_no=" + u_no + ", g_no=" + g_no + ", title=" + title
				+ ", content=" + content + ", date=" + date + "]";
	}
	

}
