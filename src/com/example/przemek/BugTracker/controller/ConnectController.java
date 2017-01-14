package com.example.przemek.BugTracker.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import com.example.przemek.BugTracker.model.ConnectModel;
import com.example.przemek.BugTracker.view.ConnectView;
import com.example.przemek.BugTracker.view.MainView;

public class ConnectController {

	ConnectModel model;
	ConnectView view;
	MainView main;
	
	public ConnectController (ConnectModel model, MainView main) {
		this.model = model;
		view = new ConnectView();
		this.main = main;
		
		view.setVisible(true);
		view.setAlwaysOnTop(true);
		
		this.view.addConnectListener(new ListenerForfillList());
		this.view.addClearListener(new ListenerForClear());
	}
	
	class ListenerForfillList implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			main.fillList(model.Connect(view.getUserName(), view.getPassword()));
			view.setVisible(false);
			
		}
		
	}
	
	class ListenerForClear implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			view.setUserName("");
			view.setPassword("");
		}
		
	}
}
