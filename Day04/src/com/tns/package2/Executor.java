package com.tns.package2;
import com.tns.package1.base;
	public class Executor {

		public static void main(String[] args) {

			//accessing different package class
			
			base b1 = new base();
			
			//private , default and protected members can't access
			
			b1.methodPublic();
			b1.varPublic = 41;
			b1.methodPublic();
			
		}
}
