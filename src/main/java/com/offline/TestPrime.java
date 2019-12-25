package com.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPrime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number::");
		String str=br.readLine();
		int num=Integer.parseInt(str);
		int flag=1;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println(num+" is a prime number");
		}
		else
			System.out.println(num+" is not a prime number");
		TestPrime ob = new TestPrime();
		System.out.println();
		ob.primeNumbersBetween1to100();
	}
	
	void primeNumbersBetween1to100(){
		
		for(int num=2;num<=100;num++){
			int flag=1;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(num+" is a prime number");
			}
//			else
//				System.out.println(num+" is not a prime number");
		}
	}

}
