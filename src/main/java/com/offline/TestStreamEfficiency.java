package com.offline;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestStreamEfficiency {

	static FileOutputStream fout = null;
	static BufferedOutputStream bout = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis;
		try {
			dis = new DataInputStream(System.in);
			// fout=new
			// FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+"streamnew.txt",
			// true);
			File file = new File("src/test/resources/" + "streamnew.txt");
			if (file.exists()) {
				fout = new FileOutputStream(file, false);
				bout = new BufferedOutputStream(fout, 1024);
			}
			System.out.println("Enter a char until  @::");
			char ch;
			while ((ch = (char) dis.read()) != '@') {
				bout.write(ch);
			}
			bout.close();
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		writeToFile();
	}

	static void writeToFile() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("src/test/resources/" + "streamnew.txt");
		try {
			if (file.exists()) {
				fout = new FileOutputStream(file,true);
				bout = new BufferedOutputStream(fout);
			}
			System.out.println("Enter a char until  @::");
			char ch;
			while((ch=(char)br.read())!='@'){
				bout.write(ch);
			}
			bout.close();
			fout.close();
		} catch (Exception e) {

		}
	}

}
