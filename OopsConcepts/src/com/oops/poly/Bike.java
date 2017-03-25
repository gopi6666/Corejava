package com.oops.poly;



public class Bike extends Overriding{
	public void run()
	{
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();
		//Overriding obj=new Overriding();
		//obj.run();
	}
}
