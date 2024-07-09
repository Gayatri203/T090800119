package com.tns.package3;

public class PrivateConstructorDemo {
	public static void main(String[] args) {

		//Can't create object with private constructor 
		
		//MyClass m1 = new MyClass();

		Myclass m = Myclass.getObject();
		m.setId(10);
		
		Myclass m1= Myc9lass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}
