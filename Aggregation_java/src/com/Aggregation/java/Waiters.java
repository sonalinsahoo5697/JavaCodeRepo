package com.Aggregation.java;

public class Waiters {
     int wtid;
     String wtname;
     Customers C;//aggregation
     
     public Waiters(int wtid,String wtname, Customers C) {
    	 this.wtid=wtid;
    	 this.wtname=wtname;
    	 this.C=C;
     }
     
     void Dis() {
    	 System.out.println(wtid);
    	 System.out.println(wtname);
    	 System.out.println(C.cname);
    	 System.out.println(C.tabNo);
     }
     public static void main(String args[]) {
    	 Customers C1=new Customers("rajesh",2);
    	 
    	 Waiters w=new Waiters(11,"hhwhjd",C1);
    	 w.Dis();
     }
}
