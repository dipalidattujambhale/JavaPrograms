package java8features;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list = new ArrayList<>();

list.add("Sakshi");
list.add("Bhayashri");
list.add("Akshada");
list.add("Dipali ");
list.add("Jagruti");
list.add("Darshini");

//Count names with length less than 7
//without using Stram Apli

int count =0;
for (String string : list) {
	if(string.length()<7) {
		count++;
	}
}
System.out.println("There are "+count+"string with length less than 7");

//with stream api
long count1=list.stream().filter(str->str.length()<7).count();
System.out.println("There are "+count1+"string with length less than 7");







	}

}
