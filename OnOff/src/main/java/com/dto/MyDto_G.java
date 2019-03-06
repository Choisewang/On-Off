package com.dto;

import java.util.Date;

public class MyDto_G {
	
	private int no;
	private String title;
	private String com;
	private Date date;
	private String img;
	
	@Override
	public String toString() {
		return "MyDto_G [no=" + no + ", title=" + title + ", com=" + com + ", date=" + date + ", img=" + img + "]";
	}
	public MyDto_G() {
		super();
	}
	public MyDto_G(int no, String title, String com, Date date, String img) {
		super();
		this.no = no;
		this.title = title;
		this.com = com;
		this.date = date;
		this.img = img;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	

}
