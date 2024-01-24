package classandobject;

import java.util.Scanner;

public class Area1 {

	float area;  //instance variable
	Scanner sc=new Scanner(System.in);
	  
	//Default method without return values
	public void circle()
	{
		float radius;
		System.out.println("Enter Radius:");
	    radius=sc.nextFloat();
	    area =3.14f*radius*radius;
	    System.out.println("Area of circle:"+area);
	
	}
	//Deafult method with return values
	public int square()
	{
		int side;
		System.out.println("Enter Side:");
		side=sc.nextInt();
		return side*side;
		
	}
	
	
	//paramerized without return types
	public void reactangle(int length,int breadth)
	{
		System.out.println("Area of Reactangle:"+(length*breadth));
	}
	
	//parameterized with  return type 
	
public float triangle(float base,float heigth)
{
	area=0.5f*base*heigth;
	return area;
	
}

//static method with parameter 
	public static void add(int a,int b)
	{
		System.out.println("Add:"+(a+b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Area1 area=new Area1();
       area.circle();
       int ar=area.square();
       System.out.println("Area of square"+ar);
	
	
	int length,breadth;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breadth");
	length=sc.nextInt();
	breadth=sc.nextInt();
	area.reactangle(length, breadth);
	
	float tr=area.triangle(3.8f, 2.6f);
	System.out.println("Area of triangle:"+tr);
	//add(10,8);
	Area1.add(14, 2);
	
	
	
	
	}

}
