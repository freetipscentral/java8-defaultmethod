package com.freetipscentral.defaultmethod.domain;

public class Student {
	private String name;
	private int roll;
	
	public Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Roll -> "+roll + " Name -> "+name;
	}
}
