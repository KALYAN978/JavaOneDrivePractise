package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
	
	public static void main(String args[]) {
		
		PrintWriter pw;  //creating a pw variable to write a file
		
		try {
			pw = new PrintWriter("jtp.txt"); // This pw will write into a file named jtp.txt
			pw.println("saved"); //this println will write the word named saved and naeme
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("fIle saved Successfully");
		
	}

}
