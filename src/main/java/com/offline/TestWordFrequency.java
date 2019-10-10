package com.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestWordFrequency {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string::");
		String str = br.readLine();
		String[] array_of_words = str.split(" ");
		
		for(int i=0;i<array_of_words.length;i++){
			int count=0;
			for(int j=0;j<array_of_words.length;j++){
				if(array_of_words[i].equals(array_of_words[j])){
					count++;
				}
			}
			//str.replaceAll(array_of_words[i], "*");
			System.out.println("Frequency of "+array_of_words[i]+"::"+count);
		}
	}
	
	/*this is a string string is an array of characters
Frequency of this::1
Frequency of is::2
Frequency of a::1
Frequency of string::2
Frequency of string::2
Frequency of is::2
Frequency of an::1
Frequency of array::1
Frequency of of::1
Frequency of characters::1
*/

}
