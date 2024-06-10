package com.tnsif.dayeight;

public abstract class Shape   //we cannot create objects
{
	
        float area ;
        
       abstract  void calArea();           //no body
       
       void display()
       {
    	   System.out.println("Area of this shape= "+area);
       }
}
