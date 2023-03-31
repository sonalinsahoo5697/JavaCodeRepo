package com.EnumConstructor.java;

enum Size {
	
	//enum constants calling the enum constructors
	SMALL(" The size is small. "),
	MEDIUM(" The size is medium. "),
	LARGE(" The size is large. "),
	EXTRALARGE("This is extralarge. ");
	
	private final String pizzaSize;

	
	
	Size(String string) {
		this.pizzaSize = string;
	}



	public String getSize() {
		return pizzaSize;
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		
		Size size = Size.SMALL;
		System.out.println(size.getSize());

	}

}
