package com.busfact.beans;

public class Student {

	private String name;
	private Long id;
	
	
	
	
	public Student() {
		super();
		System.out.println("Constructor::Student class");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}
