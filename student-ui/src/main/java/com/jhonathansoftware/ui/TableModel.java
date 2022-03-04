package com.jhonathansoftware.ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.globalsoftwaresupport.Student;

public class TableModel extends AbstractTableModel {

	private List<Student> students;
	private String[] colNames = { "ID", "NAME", "AGE", "COUNTRY", "ZIP" };

	public TableModel() {
		this.students = new ArrayList<>();
	}

	@Override
	public int getRowCount() {
		return students.size();
	}

	@Override
	public int getColumnCount() {
		return colNames.length;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colNames[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Student student = students.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return student.getId();
		case 1:
			return student.getName();
		case 2:
			return student.getAge();
		case 3:
			return student.getCountry();
		case 4:
			return student.getZipCode();
		default:
			return null;
		}
	}
	
	public void update() {
		fireTableDataChanged();
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
