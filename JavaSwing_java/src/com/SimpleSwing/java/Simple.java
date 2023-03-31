package com.SimpleSwing.java;

import javax.swing.*;

public class Simple {
 JFrame f;
 Simple(){
	 f=new JFrame();
	 JButton b=new JButton("Click");
	 b.setBounds(100, 110, 120, 90);
	 
	 f.add(b);
	 f.setSize(500, 500);
	 f.setLayout(null);
	 f.setVisible(true);
	 
 }

	public static void main(String[] args) {
	new Simple();

	}
}