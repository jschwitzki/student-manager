package com.jhonathansoftware.service;

import java.util.List;

import com.globalsoftwaresupport.Student;

public interface MainFrameService {
	public List<Student> getStudents();
	public void shutdown();
}
