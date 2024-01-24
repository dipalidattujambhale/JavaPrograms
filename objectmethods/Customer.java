package objectmethods;

public class Customer implements Cloneable {

	int id;
	String name;
	String phone;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return "Customer[id="+id +" , name="+name+", phone="+phone +"]"; }
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(100, "Dipali", "7391982421");
		Customer customer2 = new Customer(101, "Rupali", "7391982441");

		System.out.println(customer1);//customer1.to string 
		System.out.println(customer2);
		
		Customer customer3 =(Customer) customer2.clone();
		System.out.println(customer3);

	}

}
