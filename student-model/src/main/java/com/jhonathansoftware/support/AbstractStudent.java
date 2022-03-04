package com.jhonathansoftware.support;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractStudent {

	@Column(name = "age")
	protected int age;
	
	@Column(name = "zip_code")
	protected int zipCode;
	
	public AbstractStudent() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
