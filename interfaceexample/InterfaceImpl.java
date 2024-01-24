package interfaceexample;

public class InterfaceImpl implements Addable, Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl impl = new InterfaceImpl();
		impl.print();
		Addable.add(12, 2);
		impl.mul(3, 8);
		impl.div(20.0, 2);
		impl.show();
	}


		@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Div :" + (a / b));

	}
      @Override
	public void print() {
		// TODO Auto-generated method stub
	    float r=10;
	    System.out.println("Area :"+(PI*r*r));
		
	}

  	@Override
  	public void show() {
  		// TODO Auto-generated method stub
  		Addable.super.show();
  	}
  	


}
