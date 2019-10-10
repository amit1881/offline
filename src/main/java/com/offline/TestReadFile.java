package com.offline;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class TestReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ener file name::");
		String filename=br.readLine();
		FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename);
		BufferedInputStream bin=new BufferedInputStream(fin);
		int ch;
		System.out.println("File content::");
		while((ch=bin.read())!=-1){
			System.out.print((char)ch);
		}
		bin.close();
		fin.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
