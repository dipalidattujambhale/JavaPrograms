package string;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		System.out.println(s1);

		String str = "welcome ";
		System.out.println(str);

		// String methods
		System.out.println("length:" + str.length());
		System.out.println("charAt(3):"+str.charAt(3));
		
         //SubString 
		System.out.println("Substring:"+str.substring(3));
		System.out.println("Substring:"+str.substring(0,2));
	
	    //String contains method
		System.out.println("contains c:"+str.contains("c"));
	    System.out.println("contains x:"+str.contains("x"));
	
	    //String InEmpty
	    System.out.println("isEmpty");
	
	    System.out.println("equal :"+str.equals(s1));
	    
	    System.out.println("equalIgnoreCase :"+str.equalsIgnoreCase(s1));
	    System.out.println("concat :"+ str.concat("User"));
	    System.out.println(str);
	    
	    str =str.concat("User");
	    System.out.println(str);
	    System.out.println("replace :"+s1.replace('e', 'a'));
	    System.out.println("uppercase :"+s1.toUpperCase());
	    System.out.println("toLoewrcase :"+s1.toLowerCase());
	    
	  //  System.out.println("length before trim() :"+s4.length());
	 //   s4=s4.trim();
	 //   System.out.println("length after trim() :"+s4.length());
	    
	 //   String splitedString[]=s5.split(" ");
	//    System.out.println("count of words :" +splitedString.length);
	    
	 //   for(String string :splitedString )
	    {
	//    	System.out.println(string);
	    }
	    
	    
	    
	    
	    
	    
	}
	

}
