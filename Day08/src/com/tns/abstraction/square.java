package com.tns.abstraction;

public class  square extends Shape{
		float side;
		
		public square()
		{
			side=2.0f;
		}
		
		//constructor 
		public square (float side) {
			this.side=side;
		}

		
		public void calArea()
		{
			this.area =side*side;
		}
	}

