package com.demo;

public abstract class Test {
	
	Test() {
		System.out.println("Constructor");
	}
	
	//concrete method
	void show() {
		System.out.println("show");
	}
	
    abstract void display();

}
	