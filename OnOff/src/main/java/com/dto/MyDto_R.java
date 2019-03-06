package com.dto;

public class MyDto_R {
	
	private int m_no;
	private int u_no;
	private int g_no;
	private String content;
	private int star;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
	@Override
	public String toString() {
		return "MyDto_R [m_no=" + m_no + ", u_no=" + u_no + ", g_no=" + g_no + ", content=" + content + ", star=" + star
				+ "]";
	}
	public MyDto_R(int m_no, int u_no, int g_no, String content, int star) {
		super();
		this.m_no = m_no;
		this.u_no = u_no;
		this.g_no = g_no;
		this.content = content;
		this.star = star;
	}
	public MyDto_R() {
		super();
	}
	
	
	

}
