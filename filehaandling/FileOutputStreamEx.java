package filehaandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("Documents");
	    String str ="Welcome to Edubridge ";
	    byte bArray[]=str.getBytes();//to convert String  -byte
	    outputStream.write(bArray);
	    outputStream.close();
	    System.out.println("File created ");	
	}
}
