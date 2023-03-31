package com.staticClass.java;

public class Animal {
	
	//inner class
	class Reptile{
		public void displayInfo() {
			System.out.println("I am a Reptile.");
		}
		
		public void eat() {
			System.out.println("I am eating Grass and Insect");
		}
	}
	
	//static class
	static class Mammal {
		public void displayInfo() {
			System.out.println("I am a mammal.");
		}
	}

	public static void main(String[] args) {
		
		//Object Of Outer Class
		Animal Ani = new Animal();
		
		//Object Creation Of Non-static Class
		Reptile R = Ani.new Reptile();
		R.displayInfo();
		R.eat();
		
		//Object Of Static Inner Class
		Animal.Mammal Ma = new Animal.Mammal();
		Ma.displayInfo();
		

	}

}
