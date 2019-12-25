package com.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestArmstromg {
	
	static void isArmstrong(int number){
		int sum=0,r,temp;
		temp=number;
		while(number>0){
			r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		if(sum==temp){
			System.out.println(temp+" is an armstrong number");
		}
		else
			System.out.println(temp+" is not an armstrong number");
	}

	public static void main(String a[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number::");
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		int sum=0,temp,r;
		temp=num;
		while(num>0){
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(sum==temp){
			System.out.println(temp+" is an armstrong number");
		}
		else
			System.out.println(temp+" is not an armstrong number");
		
		isArmstrong(temp);
	}
}
