package com.JLabel.java;

import javax.swing.*;

public class Example {
	JTextField tf; JLabel l;JButton b;
	Example(){
		    JFrame f=new JFrame();
		    tf=new JTextField();  
	        tf.setBounds(50,50, 150,20);  
	        l=new JLabel();  
	        l.setBounds(50,100, 250,20);
	        b=new JButton("click");
	        b.setBounds(50,150,95,30);    
	        f.add(tf);f.add(l); f.add(b);    
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	}

	public static void main(String[] args) {  
		new Example(); 
	}
}
