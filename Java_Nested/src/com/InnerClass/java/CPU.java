package com.InnerClass.java;

public class CPU {
	
	double price=8000.00d;
	
	class Processor
	{
		double cores;
		String manufacturer;
		
		void setProcessor(double cores, String manufacturer) {
			this.cores = cores;
			this.manufacturer = manufacturer;
		}
		
		void getProcessor() {
			System.out.println("Processor Speed: "+cores+" GHz");
			System.out.println("Processor Manufacturer: "+manufacturer);
		}
		
		double getCache()
		{
			return 4.3;
		}
	}
	
	protected class RAM
	{
		double memory;
		String manufacturer;
		
		void setRAM(double memory, String manufacturer) {
			this.memory = memory;
			this.manufacturer = manufacturer;
		}
		
		void getRAM() {
			System.out.println("RAM Size: "+memory);
			System.out.println("RAM Manufacturer: "+manufacturer);
		}
		
		double getClockSpeed()
		{
			return 5.5;
		}
	}

	public static void main(String[] args) {
		
		CPU C = new CPU();
		
		Processor P = C.new Processor();
		
		RAM R = C.new RAM();
		
		P.setProcessor(2.6,"Intel");
		
		R.setRAM(8.0, "nVidia");
		
		P.getProcessor();
		
		System.out.println("Processor Cache Memory: "+P.getCache());
		
		R.getRAM();
		
		System.out.println("RAM Clock Speed: "+R.getClockSpeed());
		
		System.out.println("Price OF CPU: "+C.price);

	}

}

//if static inner class => OuterClass.InnerClass obj = new OuterClass.InnerClass();




