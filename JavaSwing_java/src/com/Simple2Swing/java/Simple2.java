package com.Simple2Swing.java;

import javax.swing.*;

public class Simple2 extends JFrame {
	JFrame f;
	 Simple2(){
		f=new JFrame();
		JButton b=new JButton("Click here");
		b.setBounds(180,180,120,90);
		
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	 }

	public static void main(String[] args) {
		new Simple2();

	}

}