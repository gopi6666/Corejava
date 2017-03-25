package com.oops.inheritance.interfac;

 public class C implements B, A {
	 
	 public void a_for()
	 {
		 System.out.println("A for apple");
	 }
	 public void b_for()
	 {
		 System.out.println("B for ball");
	 }
	 
	 public static void main(String[] args) {
		
		 C c=new C();
		 c.a_for();
		 c.b_for();
	}

}
