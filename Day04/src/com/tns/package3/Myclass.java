package com.tns.package3;

public class Myclass {
	private static Myclass obj=new Myclass();

	private int id;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Myclass()
	{
		System.out.println("MyClass obhject created ");
	}

	public static Myclass getObject()  //factory method 
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
}
