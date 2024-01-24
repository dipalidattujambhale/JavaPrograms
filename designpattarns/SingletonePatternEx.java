package designpattarns;

class SingleObject{
	//create an object
	private static SingleObject instance =new SingleObject();
	
	//create private constructor so that class can not be instances
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("accessing method using single object");
	}
	
}

public class SingletonePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we cant create object of singlrobject class because constructor is private
		//SingleObject singleObject =new Si
		SingleObject obj =SingleObject.getInstance();
	obj.show();
	}

}
