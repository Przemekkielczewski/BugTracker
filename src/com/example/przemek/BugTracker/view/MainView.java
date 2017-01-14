package com.example.przemek.BugTracker.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class MainView extends JFrame {

	private JLabel label;
	private JPanel panel;
	DefaultListModel<String> listModel;
	JList<String> list;
	JScrollPane listScroller;

	public MainView() {

		this.setSize(400, 300);

		label = new JLabel("Employees:");
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(180, 220));
		panel = new JPanel();
		panel.add(listScroller);
		this.add(label, BorderLayout.NORTH);
		this.add(panel, BorderLayout.WEST);
	}

	public void fillList(String[] table) {
		for (int i = 0; i <= table.length - 1; i++) {
			listModel.addElement(table[i]);
		}
	}

	public String getSelection() {
		return (String) (this.list.getSelectedValue());
	}
}
