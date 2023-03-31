package com.Swing.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Component {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JButton jb = new JButton("Kick Me...");
		jb.setBounds(180, 100, 100, 80);
		jf.add(jb);
		
		JButton jb1 = new JButton("Right Me...");
		jb1.setBounds(180, 200, 100, 80);
		jf.add(jb1);
		
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
	}

}
