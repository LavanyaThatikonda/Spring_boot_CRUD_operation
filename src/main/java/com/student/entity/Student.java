package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	private int roll_number;
	private String name;
	private String address;
	
	public Student() {
		super();
	}
	public Student(int roll_number, String name, String address) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.address = address;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", address=" + address + "]";
	}
	

}
