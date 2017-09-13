package com.sogl.springcore.pojo;

public class User {

	private String firstName;
	private String lastName;
	private String surName;
	private String nickName;
	private Integer rollNo;

	public User(String firstName, String lastName, Integer rollNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}
	
	public void doInit() {
		System.out.println("User ["+firstName+"] created.");
	}
	
	public void doDestroy() {
		System.out.println("User ["+firstName+"] dying......");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}
	
	

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
