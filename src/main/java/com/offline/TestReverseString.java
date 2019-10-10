package com.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestReverseString {
	
	private static void reversePrint(String str){
		String []strarr=str.split(" ");
		for(int i=strarr.length-1;i>=0;i--){
			System.out.print(strarr[i]+" ");
		}
	}
	
	private static void countDuplicateString(String []str){
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String st:str){
			int count=1;
			if(hm.containsKey(st)){
				hm.put(st, hm.get(st)+1);
			}
			else{
			hm.put(st, count);
			}
		}
		System.out.println("\n");
		for(Entry<String,Integer> en:hm.entrySet()){
			if(en.getValue()>1){
			System.out.println(en.getKey()+"::"+en.getValue());
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string::");
		String str=br.readLine();
		String[] array_of_words=str.split(" ");
		String reversestring="";
//		for(String words: array_of_words){
//			System.out.println(words);
//		}
		
		for(int i=0;i<array_of_words.length;i++){
			char[] words=array_of_words[i].toCharArray(); 
			String reverseword="";
			for(int j=words.length-1;j>=0;j--){
				reverseword+=words[j];
			}
			reversestring+=reverseword+" ";
		}
		
		System.out.println(reversestring);
		
		reversePrint(str);
		String []strarr={"java","c","sql","java","java","oracle","sql","mysql","sql","java"};
		countDuplicateString(strarr);
		char[] strchar=str.toCharArray();
		char[] digit={0,1,2,3,4,5,6,7,8,9};
		for(int i=strchar.length-1;i>=0;i--){
			
				
			
		}
	}

}
