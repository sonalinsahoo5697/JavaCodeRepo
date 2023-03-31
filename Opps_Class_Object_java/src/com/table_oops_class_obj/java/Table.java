package com.table_oops_class_obj.java;

public class Table {
	String type;
	int price;
	
	void tab_input() {
		type="wood";
		price=5000;
	}
	void tab_disp() {
		System.out.println("Table type:"+type);
		System.out.println("Table price:"+price);
	}

	public static void main(String[] args) {
		Table t=new Table();
		t.tab_input();
		t.tab_disp();
	}

}
