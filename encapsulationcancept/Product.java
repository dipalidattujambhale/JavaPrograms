package encapsulationcancept;

public class Product {

	
	
	private int ProductId;
	private String ProductName;
	private double ProductPrice;
	
	
	public static int getProductId()
	{
		return 100;
	}
	
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public static String getProductName() {
		return "Mobile";
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public static double getProductPrice() {
		return 200;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product pro=new Product();
        pro.setProductId(100);
        pro.setProductName("Bag");
        pro.setProductPrice(200);
        
        System.out.println("ProductId :" + Product.getProductId());
        System.out.println("ProductName :"+Product.getProductName());
        System.out.println("ProductPrice: "+Product.getProductPrice());
        
	}

}
