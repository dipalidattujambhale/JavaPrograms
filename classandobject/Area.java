package classandobject;

import java.awt.Rectangle;

public class Area {
	
	//create a class area and 4 method circle,squre,reactangle,and triangle and calculate area 	
	//variable Declaration 
	double length;
	double breadth;
	double radius;
	double side;
	double base=2;
	double heigth =5;
	
	//Default Constaructor
	public Area()
	{
		double length=12;
		double breadth=10;
		double radius =4;
		double side=6;
		double base=2;
		double heigth =5;
		
	}
	//para Const
	public Area(double length,double breadth,double radius,double side,double base,double heigth)
	{
		this.length=length;
		this.breadth=breadth;
		this.radius=radius;
		this.side=side;
		this.base=base;
		this.heigth=heigth;
		
		
	}
	//create void method or static method 
	public void reactangleArea()
	{
		 double reactangle = length*breadth;
		System.out.println("Rectangle Area:"+reactangle);
		
	}
	public void squareArea()
	{
		double square=side*side;
		System.out.println("Square Area:"+square);
	}
	
	
	public void circleArea()
	{
		double circle=(22/7)*radius*radius;
		System.out.println("circle Area:+circle");
	}
	public void triangleArea()
	{
		double height = 0;
		this.heigth=height;
		double triangle=(0.5)*base*height;
		System.out.println("Triangle Area:+triangle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area area1=new Area();
		area1.circleArea();
		area1.squareArea();
		area1.reactangleArea();
		area1.triangleArea();
		
		Area area2=new Area(15,5,4,6,12,18);
		area2.circleArea();
		area2.squareArea();
		area2.reactangleArea();
		area2.triangleArea();	
	}
	
}	