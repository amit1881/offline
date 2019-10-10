package com.offline;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class TestStreamEfficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DataInputStream dis;
        FileOutputStream fout;
        BufferedOutputStream bout;
        try{
        	dis=new DataInputStream(System.in);
        	fout=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+"streamnew.txt", true);
        	bout=new BufferedOutputStream(fout, 1024);
        	System.out.println("Enter a char until  @::");
        	char ch;
        	while((ch=(char)dis.read())!='@'){
        		bout.write(ch);
        	}
        	bout.close();
        	fout.close();
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
	}

}
