package com.tns.abstraction;

public class ShapeDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     square s= new square();
     s.calArea();
     s.show();
     
     Rectangle r=new Rectangle();
     r.calArea();
     s.show();
     
     
     //dynamic bind
     
     Shape s1;
     s1=new square(5.0f);
     s1.calArea();
     s1.show();
     
     s1=new Rectangle(10f,7f);
     s1.calArea();
     s1.show();
     
	}

}
