package com.demo;

public interface I1 {
	
	 int a=10; //  public static final int i=10;
	
	 void m1(); //compilation time -public abstract void m1();
	 
	 //1.8 version after 
	 static void m2() {
		 System.out.println("I1-static method");
		 //1000 lines of code 
		// m3();
	 }
	 //1.8 v after
	 default void m4() {
		 System.out.println("I1-default method");
	 }
	 
	 //after 1.9 version we can create private method 
	/*private void m3() {
		
	}*/
}
