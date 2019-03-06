package com.dto;

import java.util.Date;

public class MyDto_U {
	
	private int no;
	private String grade;
	private String id;
	private String pw;
	private int age;
	private String lo;
	private String gen;
	private int phone;
	private Date date;
	private String img;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public MyDto_U(int no, String grade, String id, String pw, int age, String lo, String gen, int phone, Date date,
			String img) {
		super();
		this.no = no;
		this.grade = grade;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.lo = lo;
		this.gen = gen;
		this.phone = phone;
		this.date = date;
		this.img = img;
	}
	
	public MyDto_U(int no, String grade, String id, String pw, int age, String lo, String gen, int phone, Date date) {
		super();
		this.no = no;
		this.grade = grade;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.lo = lo;
		this.gen = gen;
		this.phone = phone;
		this.date = date;
	}
	
	
	public MyDto_U() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyDto_U [no=" + no + ", grade=" + grade + ", id=" + id + ", pw=" + pw + ", age=" + age + ", lo=" + lo
				+ ", gen=" + gen + ", phone=" + phone + ", date=" + date + ", img=" + img + "]";
	}
	
	
	
	
}
