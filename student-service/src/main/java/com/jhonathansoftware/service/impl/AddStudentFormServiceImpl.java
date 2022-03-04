package com.jhonathansoftware.service.impl;

import com.jhonathansoftware.query.AddStudentFormQuery;
import com.jhonathansoftware.service.AddStudentFormService;

public class AddStudentFormServiceImpl implements AddStudentFormService{

	private AddStudentFormQuery query;
	
	public AddStudentFormServiceImpl() {
		this.query = new AddStudentFormQuery();
	}
	
	@Override
	public void insert(Student student) {
		this.query.insert(student);
	}
}
