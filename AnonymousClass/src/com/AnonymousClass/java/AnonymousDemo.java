package com.AnonymousClass.java;

public class AnonymousDemo {
		
		public void createClass() {	
			//creating of anonymous class extending  class polygon
			Polygon p1 = new Polygon() {
				public void display() {
					System.out.println("Inside the anonymous class.");	
				}
			};
			
			p1.display();
			
		}
}
