package com.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

class TestArithmeticOperations{
	public void testFactorial(int number){
		int factorial=1;
		for(int i=number;i>=1;i--){
			factorial=factorial*i;
		}
		System.out.println("factorial of "+number+"="+factorial);
	}
	
	public int testRecursion(int number){
		int factorial;
		if(number==1){
			return 1;
		}
		else
			factorial=number*testRecursion(number-1);
		return factorial;
	}
	
	public void testFibonacciSeries(int n1,int n2,int noe){
		System.out.print(n1+","+n2);
		int sum=0;
		for(int i=1;i<=noe;i++){
			sum=n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;
		}
	}
	
	public void testCharacterFrequency(String str){
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		int count=1;
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, count);
			}
		}
		System.out.println();
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"="+en.getValue());
		}
	}
	
	public void testWordFrequency(String str){
		String[] words=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		int count=1;
		for(String word:words){
			if(hm.containsKey(word)){
				hm.put(word, hm.get(word)+1);
			}
			else{
				hm.put(word, count);
			}
		}
		
		System.out.println();
		for(Entry<String,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"="+en.getValue());
		}
	}
}

public class TestBasicArithmetic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TestArithmeticOperations ob=new TestArithmeticOperations();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number::");
		String str=br.readLine();
		ob.testFactorial(Integer.parseInt(str));
		System.out.println("factorial of "+str+"="+ob.testRecursion(Integer.parseInt(str)));
		ob.testFibonacciSeries(0, 1, 8);
		ob.testCharacterFrequency("automation testing");
		ob.testWordFrequency("create a testing framework for testing web apps");
	}

}
