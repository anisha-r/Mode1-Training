package com.hcl.as;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Student s = new Student(1, "anisha", "coimbatore", 9);
			objout.writeObject(s);
			objout.close();
			fout.close();
			System.out.println("data stored");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 