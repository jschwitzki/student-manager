package com.jhonathansoftware.service.impl;

import java.util.List;

import com.globalsoftwaresupport.Student;
import com.globalsoftwaresupport.query.RemoveStudentFormQuery;
import com.globalsoftwaresupport.service.RemoveStudentFormService;

public class RemoveStudentFormServiceImpl implements RemoveStudentFormService {

	private RemoveStudentFormQuery query;
	
	public RemoveStudentFormServiceImpl() {
		this.query = new RemoveStudentFormQuery();
	}
	
	@Override
	public List<Student> getAllStudents() {
		return query.getAllStudents();
	}

	@Override
	public void remove(Student student) {
		query.remove(student);
	}

}
