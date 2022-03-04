package com.jhonathansoftware.service;

import java.util.List;

import com.globalsoftwaresupport.Student;

public interface RemoveStudentFormService {
	public List<Student> getAllStudents();
	public void remove(Student student);
}
