package com.tiger_oops_class_obj.java;

public class Tiger {
    String colour,gender;
    
    void Tiger_Input() {
    	colour="white";
    	gender="female";
    }
    void Tiger_Display() {
    	System.out.println("Tiger colour:"+colour);
    	System.out.println("Tiger gender:"+gender);
    }
    
	public static void main(String[] args) {
	   Tiger t=new Tiger();
       t.Tiger_Input();
       t.Tiger_Display();
	}

}
