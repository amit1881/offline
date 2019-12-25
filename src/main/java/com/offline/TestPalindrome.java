package com.offline;

import java.io.*;

class TestPalindromeString {
	void testPalindrome(String str){
		char[] ch=str.toCharArray();
//		int j=0;
//		for(int i=ch.length-1;i>=0;i--){
//			if (j < i) {
//				char temp = ch[j];
//				ch[j] = ch[i];
//				ch[i] = temp;
//				j++;
//			}
//		}
//		System.out.println(ch);
//		if(str.equals(ch.toString())){
//			System.out.println("palindrome");
//		}
//		else{
//			System.out.println("not palindrome");
//		}
//		
//	}
		String str1="";
		for(int i=ch.length-1;i>=0;i--){
			Character c=ch[i];
			str1=str1.concat(c.toString());
		}
		
		if(str.equals(str1)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}

public class TestPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number::");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int sum = 0, temp, reminder;
		temp = num;
		while (num > 0) {
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is a palindrome number");
		} else
			System.out.println(temp + " is not a palindrome number");

		TestPalindromeString ob = new TestPalindromeString();
		ob.testPalindrome("nitinn");
		ob.testPalindrome(str);
	}

}
