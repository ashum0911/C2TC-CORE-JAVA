package com.tnsif.dayeight;

public class Square extends Shape
{
	
	float side;
	
	public Square(){
		side=0.4f;
	}
	
	public Square (float side ) {
		super();
		this.side=side;
	}
	

	@Override
	void calArea() {
		super.area= side* side;
		
	}

}
