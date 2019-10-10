package com.offline;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis;
		FileOutputStream fout;
		try {
			dis = new DataInputStream(System.in);
			//get the current working directory--System.getProperty("user.dir"));
			//This will give a complete absolute path from where your application was initialized.
			System.out.println(System.getProperty("user.dir"));
			fout = new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+"stream.txt", true);

			System.out.println("Enter a character till @::");
			char ch;
			while ((ch = (char) dis.read()) != '@') {
				fout.write(ch);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

}
