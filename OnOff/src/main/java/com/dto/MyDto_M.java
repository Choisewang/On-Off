package com.dto;

import java.util.Date;

public class MyDto_M {
	
	private int m_no;
	private int u_no;
	private int g_no;
	private String title;
	private String np;
	private String com;
	private String lo;
	private Date cd;
	private Date ed;
	private Date md;
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public MyDto_M() {
		super();
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
	public String getNp() {
		return np;
	}
	public void setNp(String np) {
		this.np = np;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getLo() {
		return lo;
	}
	public void setLo(String lo) {
		this.lo = lo;
	}
	public Date getCd() {
		return cd;
	}
	public void setCd(Date cd) {
		this.cd = cd;
	}
	public Date getEd() {
		return ed;
	}
	public void setEd(Date ed) {
		this.ed = ed;
	}
	public Date getMd() {
		return md;
	}
	public void setMd(Date md) {
		this.md = md;
	}
	public MyDto_M(int m_no, int u_no, int g_no, String title, String np, String com, String lo, Date cd, Date ed,
			Date md) {
		super();
		this.m_no = m_no;
		this.u_no = u_no;
		this.g_no = g_no;
		this.title = title;
		this.np = np;
		this.com = com;
		this.lo = lo;
		this.cd = cd;
		this.ed = ed;
		this.md = md;
	}
	@Override
	public String toString() {
		return "MyDto_M [m_no=" + m_no + ", u_no=" + u_no + ", g_no=" + g_no + ", title=" + title + ", np=" + np
				+ ", com=" + com + ", lo=" + lo + ", cd=" + cd + ", ed=" + ed + ", md=" + md + "]";
	}

}
