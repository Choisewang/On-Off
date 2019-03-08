package com.dto;

import java.util.Date;

public class MyDto_U {
	
	private String id;
	private String pw;
	private String grade;
	private String name;
	private Date birth;
	private String mail;
	private String lo;
	private String gen;
	private int phone;
	private Date date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getLo() {
		return lo;
	}
	public void setLo(String lo) {
		this.lo = lo;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public MyDto_U(String id, String pw, String grade, String name, Date birth, String mail, String lo, String gen,
			int phone, Date date) {
		super();
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.name = name;
		this.birth = birth;
		this.mail = mail;
		this.lo = lo;
		this.gen = gen;
		this.phone = phone;
		this.date = date;
	}
	public MyDto_U() {
		super();
	}
	@Override
	public String toString() {
		return "MyDto_U [id=" + id + ", pw=" + pw + ", grade=" + grade + ", name=" + name + ", birth=" + birth
				+ ", mail=" + mail + ", lo=" + lo + ", gen=" + gen + ", phone=" + phone + ", date=" + date + "]";
	}
	
	
}
