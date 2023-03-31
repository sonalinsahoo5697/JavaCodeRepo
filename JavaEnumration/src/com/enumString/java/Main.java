package com.enumString.java;


enum Size
{
	SMALL {
		//overriding toString() for SMALL
		public String toString() {
			return "The size is small.";
		}
	},
	
	MEDIUM {
		//overriding toString() for MEDIUM
		public String toString() {
			return "The size is Medium.";
		}
	},
		
	LARGE {
			public String toString() {
				return "The size is Large";
			}
		}
};


public class Main {

	public static void main(String[] args) {
		
		System.out.println(Size.LARGE.toString());
		

	}

}
