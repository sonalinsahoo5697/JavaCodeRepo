package com.JLabel.java;

import javax.swing.*;

public class Label {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JLabel l1 =new JLabel("first label");
		l1.setBounds(180, 180, 100, 60);
		
		JLabel l2=new JLabel("second label");
		l2.setBounds(200, 200, 100, 60);
		
		f.add(l1);
		f.add(l2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

	}

}