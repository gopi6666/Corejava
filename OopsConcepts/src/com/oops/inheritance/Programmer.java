package com.oops.inheritance;

 class Programmer extends Employee{
	
	int bonus = 5000;
	
	public static void main(String[] args) {
		
		Programmer p= new Programmer();
		System.out.println("Employee Salary is:"+p.salary);
		System.out.println("Employee bonus is:"+p.bonus);
	}
}
