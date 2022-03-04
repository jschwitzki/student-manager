package com.jhonathansoftware.ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import com.globalsoftwaresupport.Student;

public class TablePanel extends JPanel {

	private JTable table;
	private TableModel tableModel;
	
	public TablePanel() {
		initializeVariables();
		initializeLayout();
		initializeHeaderAlignment();
		initializeTableAlignment();
	}
	
	// the column names as well as the data in the table
	// is centered horizontally
	private void initializeHeaderAlignment() {
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.getTableHeader().setDefaultRenderer(renderer);
	}

	private void initializeTableAlignment() {
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(renderer);
		table.getColumnModel().getColumn(1).setCellRenderer(renderer);
		table.getColumnModel().getColumn(2).setCellRenderer(renderer);
		table.getColumnModel().getColumn(3).setCellRenderer(renderer);
		table.getColumnModel().getColumn(4).setCellRenderer(renderer);
	}

	private void initializeLayout() {
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(10, 30, 10, 30));
		add(new JScrollPane(table), BorderLayout.CENTER);
	}

	private void initializeVariables() {
		this.tableModel = new TableModel();
		this.table = new JTable(tableModel);
	}
	
	public void setTableModel(List<Student> students) {
		this.tableModel.setStudents(students);
	}
	
	public void update() {
		this.tableModel.update();
	}
}
