package com.Tiger_copy.java;

public class Tiger_Copy  {
	String color,Gender;
	
	Tiger_Copy(){
		color="Brown";
		Gender="Male";
	}
	Tiger_Copy(Tiger_Copy ref){
		color=ref.color;
		Gender=ref.Gender;
	}
	public static void main(String[] args) {
		Tiger_Copy t=new Tiger_Copy();
		Tiger_Copy t1=new Tiger_Copy(t);
		t1.color=t.color;
		t1.Gender=t.Gender;
		System.out.println(t1.color);
		System.out.println(t1.Gender);
	}

}
