package com.demo;

public  class Child extends Test {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}
	/*void childDisplay() {
		System.out.println("childDisplay");
	}*/
	public static void main(String[] args) {
		//Child c = new Child();
		Test obj = new Child(); //dynamic dispatch
		//c.show();
		//c.display();
		obj.show();
		obj.display();
		//obj.childDisplay();//C.E 
	}
	
	

}
