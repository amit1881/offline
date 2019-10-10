package com.offline;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class assignment1 {

	public void writecontent1(String txt) throws IOException {
		FileWriter fw1=new FileWriter("C:\\Users\\int120\\Desktop\\nw\\text1.txt");
		fw1.write(txt);
		fw1.close();
	}
	
	public void addcontent2(String txt1) throws IOException {
		String data=txt1;
		FileWriter fw2=new FileWriter("C:\\Users\\int120\\Desktop\\nw\\text1.txt",true);
		BufferedWriter br=new BufferedWriter(fw2);
		fw2.write(data);
		fw2.close();
	}

	public void copycontent()throws IOException {
		File file=new File("C:\\Users\\int120\\Desktop\\nw\\text3.txt");
		FileReader fr=new FileReader("C:\\Users\\int120\\Desktop\\nw\\text1.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(file);
		BufferedWriter br1=new BufferedWriter(fw);
		
		String s=br.readLine();
			 br1.write(s);
			 fw.flush();
			

		 
		 br.close();
		 fw.close();
		 br1.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		assignment1 ob=new assignment1();
		
		 String s1="Welcome to Xceedance";
		 ob.writecontent1(s1);
		 String s2="Enjoy Working Here and enhance your knowledge.!!!";
		 ob.addcontent2(s2);
		 ob.copycontent();
		 System.out.println("Success...");
	}

}
