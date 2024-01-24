package abstructionexample;
//we have to calculate the percentage of marks obtained in three subject(each out of 100)
//by student A and in four subject (each out of 100)by student B.Create an abstract 
//class 'Marks' with an abstract method 'getPercentage'.it is inherited by two other
//classes 'A' and 'B' each having a method with the same name which return the Percentage of the 
//student.
abstract class Marks
{
	public abstract float getPercentage();
}

class A extends Marks
{
int marks1,marks2,marks3;
A(int m1,int m2,int m3)
{
	marks1=m1;
	marks2=m2;
	marks3=m3;
	
}
	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
	  float total=((marks1+marks2+marks3)/(float)300)*100;
	  return total;
	}
	
}

class B extends Marks
{
int marks1,marks2,marks3;
B(int m1,int m2,int m3)
{
	marks1=m1;
	marks2=m2;
	marks3=m3;
	
}
	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
	  float total=((marks1+marks2+marks3)/(float)400)*100;
	  return total;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		A a=new A(10,20,30);
		System.out.println(a.getPercentage());
		
		B b=new B(2,3,5);
		System.out.println(b.getPercentage());
	}

}
