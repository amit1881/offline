package com.offline;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;

public class TestReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ener file name::");
		String filename=br.readLine();
		File file=new File("src/test/resources/"+filename);
		//FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename);
		FileInputStream fis=null;
		if(file.exists()){
			fis=new FileInputStream(file);
		}
		else{
			System.out.println(file.getName()+" doesn't exist");
		}
		BufferedInputStream bin=new BufferedInputStream(fis);
		int ch;
		System.out.println("File content::");
		while((ch=bin.read())!=-1){
			System.out.print((char)ch);
		}
		bin.close();
		fis.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
