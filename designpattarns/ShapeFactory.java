package designpattarns;

import junit.Square;

interface Shape {
	void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing Circle ");

	}

}

class Reactangle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing Reactangle ");

	}

}

class Squre implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing Squre ");

	}

}

class ShapeFactoryEx {
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle"))
		return new Circle();
		
		else if(shapeType.equalsIgnoreCase("Reactangle"))
			return new Reactangle();
			
		else if(shapeType.equalsIgnoreCase("Square"))
			return (Shape) new Square();
		else 
			return null;	
	}
}
/*
public class ShapeFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape;
		
		shape = shapeFactory.getShape("Circle");
		shape.draw();

		shape = shapeFactory.getShape("Reactangle");
		shape.draw();

		shape = shapeFactory.getShape("Square");
		shape.draw();

	}*/

	