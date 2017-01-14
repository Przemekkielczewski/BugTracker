package com.example.przemek.BugTracker.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConnectView extends JFrame {
	
	//clear
	//connect
	//set them as connection values
	private JTextField username;
	private JTextField password;
	
	private JLabel title;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	
	private JButton clearButton;
	private JButton connectButton;
	
	private JPanel inputPanel;
	private JPanel buttonPanel;
	
	public ConnectView(){
		
		this.setSize(200, 100);
		
		usernameLabel = new JLabel(" Username: ");
		passwordLabel = new JLabel(" Password: ");
		username = new JTextField();
		password = new JPasswordField();
		
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout (2,2));
		
		inputPanel.add(usernameLabel);
		inputPanel.add(username);
		inputPanel.add(passwordLabel);
		inputPanel.add(password);
		
		clearButton = new JButton("Clear");
		connectButton = new JButton("Connect");
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout (1,2));
		buttonPanel.add(clearButton);
		buttonPanel.add(connectButton);
		
		
		this.add(inputPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public String getUserName () {
		return username.getText();
	}
	
	public String getPassword () {
		return password.getText();
	}
	
	public void setUserName (String userName) {
		this.username.setText(userName);
	}
	
	public void setPassword (String password) {
		this.password.setText(password);
	}
	
	public void addClearListener (ActionListener listenerForClear) {
		this.clearButton.addActionListener(listenerForClear);
	}
	
	public void addConnectListener (ActionListener listenerForConnect) {
		this.connectButton.addActionListener(listenerForConnect);
	}

}
