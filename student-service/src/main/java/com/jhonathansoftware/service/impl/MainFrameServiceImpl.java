package com.jhonathansoftware.service.impl;

import java.util.List;
import com.globalsoftwaresupport.Student;
import com.globalsoftwaresupport.query.MainFrameQuery;
import com.globalsoftwaresupport.service.MainFrameService;

public class MainFrameServiceImpl implements MainFrameService {

	private MainFrameQuery query;
	
	public MainFrameServiceImpl() {
		this.query = new MainFrameQuery();
	}
	
	@Override
	public List<Student> getStudents() {
		return query.getAllStudents();
	}

	@Override
	public void shutdown() {
		this.query.shutdown();
	}
}
