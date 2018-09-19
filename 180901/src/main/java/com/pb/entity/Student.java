package com.pb.entity;

public class Student {
	
	
	String name;
	String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	

	
	
}
