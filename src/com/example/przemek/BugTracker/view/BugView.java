package com.example.przemek.BugTracker.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BugView extends JFrame {
	private JLabel fnameLabel;
	private JLabel lnameLabel;
	private JLabel jobLabel;
	private JLabel salaryLabel;
	private JLabel hireDateLabel;
	private JLabel CommissionLabel;
	
	private JTextField fname;
	private JTextField lname;
	private JTextField job;
	private JTextField salary;
	private JTextField hireDate;
	private JTextField Commission;
	
	private JPanel employeePanel;
	
	public BugView () {
		this.setSize(300,200);
		
	}
}
