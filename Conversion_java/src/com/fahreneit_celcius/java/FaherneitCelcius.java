package com.fahreneit_celcius.java;

public class FaherneitCelcius {

	public static void main(String[] args) {
		int F=115;
		float C =((F-32)*5)/(float)9;  // This (float)9 is type casting..
        System.out.println("Fahrenheit to Celcius: C = (F-32) (5/9)\n" + C);
        
       /*Celcius to faherneit*/
        double c = 46.11;
        double f = (c * 9/5) + 32;
        System.out.println("Celsius to Fahrenheit: f = c(9/5) + 32\n" + f );
        
       /*Fahrenheit to Kelvin */
         int Fah=100;
         double K = ((Fah - 32)*5)/9+ 273.15;
         System.out.println("Fahrenheit to Kelvin : \n" + K );
         
         /*Kelvin to Fahrenheit */
         double kelvin ,fah;
          kelvin = 120;
          fah =(kelvin - 273.15) * 9/5 + 32;
         System.out.println("Kelvin to Fahrenheit : \n" + fah);
         
         /* Celcius to Kelvin */
          int celcius=5;
          double k = celcius + 273.15;
          System.out.println("Celcius to Kelvin : \n" + k);
          
          /*Kelvin to Celcius*/
          double kel , cel ;
           kel=283.15;
           cel= kel - 273.15;
          System.out.println("Kelvin to Celcius : \n" + cel);
          
	}

}
