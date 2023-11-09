package Lab15_16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoClass {

	public static void main(String[] args) {
		File f = new File("newFile.txt");
		
		
		String str = "Hello this is my first file";
	     try {
	       
	       FileWriter fw = new FileWriter("newFile.txt");

	       
	       fw.write(str);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       fw.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	     
	     char[] arr = new char[100];
	     try {
	       
	       FileReader fr = new FileReader("newFile.txt");

	      
	       fr.read(arr);
	       System.out.println("Data in the file:");
	       System.out.println(arr);

	      
	       fr.close();
	     }
	     catch(Exception e) {
	       e.getStackTrace();
	     }
	}

}
