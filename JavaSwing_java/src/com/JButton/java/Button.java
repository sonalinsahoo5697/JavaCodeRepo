package com.JButton.java;

import javax.swing.*;

public class Button {

	public static void main(String[] args) {
		JFrame f=new JFrame("java");
		JButton b=new JButton("click");
        b.setBounds(180, 180, 90, 110);
        
        f.add(b);
        f.setLayout(null);
        f.setSize(1200,1200);
        f.setVisible(true);
	}

}
