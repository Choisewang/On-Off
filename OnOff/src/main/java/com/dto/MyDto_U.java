package com.dto;

import java.util.Date;

public class MyDto_U {
	
	private int no;
	private String grade;
	private String id;
	private String pw;
	private String name;
	private int age;
	private String mail;
	private String lo;
	private String gen;
	private int phone;
	private Date date;
	private String img;
	
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
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
	
	public MyDto_U() {
		// TODO Auto-generated constructor stub
	}
	public MyDto_U(int no, String grade, String id, String pw, String name, int age, String mail, String lo, String gen,
			int phone, Date date, String img) {
		super();
		this.no = no;
		this.grade = grade;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.lo = lo;
		this.gen = gen;
		this.phone = phone;
		this.date = date;
		this.img = img;
	}
	@Override
	public String toString() {
		return "MyDto_U [no=" + no + ", grade=" + grade + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age="
				+ age + ", mail=" + mail + ", lo=" + lo + ", gen=" + gen + ", phone=" + phone + ", date=" + date
				+ ", img=" + img + "]";
	}
	
	
}
