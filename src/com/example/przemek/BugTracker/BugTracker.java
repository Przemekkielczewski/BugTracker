package com.example.przemek.BugTracker;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import com.example.przemek.BugTracker.controller.ConnectController;
import com.example.przemek.BugTracker.model.ConnectModel;
import com.example.przemek.BugTracker.view.BugView;
import com.example.przemek.BugTracker.view.ConnectView;
import com.example.przemek.BugTracker.view.MainView;


public class BugTracker {

	public static void main(String[] args) {
		
		MainView mainView = new MainView();
		ConnectModel loginModel = new ConnectModel();
		
		ConnectController Controller = new ConnectController (loginModel, mainView);
		
		mainView.setVisible(true);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

