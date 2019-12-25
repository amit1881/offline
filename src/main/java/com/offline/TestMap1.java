package com.offline;

import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 public class TestMap1 {
	
	public static int a=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter a string::");
//		String str=br.readLine();
//		testHashMap(str);
//		testPrime(49);
//		testArmstrong(152);
//		testPalindrome(1234);
//		testPalindrome("navjejvan");
//		testFib(8);
//		testCharacterCount("AABBBCCCC");
//		testCommonNumbers();
		//testReverseWordsOfAString("AB CD EF GH IJ");
		//testWordCount("AB CD EF GH IJ AB GH XY AB");
		//testSumOfDigits(1123);
		testReadExcel("testdata//emp.xlsx","employee");
	}

	protected static void testHashMap(String str) {
		String[] arr = str.split(" ");
		int count = 1;
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
		for (String ar : arr) {
			if (m1.containsKey(ar)) {
				m1.put(ar, m1.get(ar)+1);
			} else {
				m1.put(ar, count);
			}
		}
		
		for(Entry<String,Integer> en: m1.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		
		for (String ar : arr) {
			if (m2.containsKey(ar)) {
				m2.put(ar, m2.get(ar)+1);
			} else {
				m2.put(ar, count);
			}
		}
		
		for(Entry<String,Integer> en: m2.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		

	}

	private static void testCharacterCount(String str){
		char []ch=str.toCharArray();
		int count=1;
		Map<Character, Integer> m1=new LinkedHashMap<Character, Integer>();
		
		for(char c:ch){
			if(m1.containsKey(c)){
				m1.put(c, m1.get(c)+1);
			}
			else{
				m1.put(c, count);
			}
		}
		
		for(Entry<Character,Integer> en:m1.entrySet()){
			System.out.println(en.getKey()+"="+en.getValue());
		}
	}
	
	private static void testPrime(int n){
		int flag=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
			flag=1;
			break;
			}
		}
		if(flag==0){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}
	}
	
	private static void testArmstrong(int n){
		int sum=0;
		int temp=n;
		int r;
		while(n>0){
			r=n%10;
			sum+=r*r*r;
			n=n/10;
			
		}
		
		if(temp==sum){
			System.out.println(temp+" is an armstrong number");
		}
		else{
			System.out.println(temp+" is not an armstrong number");
		}
	}
	
	private static void testPalindrome(int n){
		int temp=n;
		int sum=0;
		int r;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		
		System.out.println("sum="+sum);
		
		if(temp==sum){
			System.out.println(temp+" is an palindrome number");
		}
		else{
			System.out.println(temp+" is not an palindrome number");
		}
	}

	private static void testPalindrome(String str){
		char []a=str.toCharArray();
		int flag=0;
		int j=0;
		for(int i=a.length-1;i>(a.length)/2;i--){
			if(a[j]!=a[i]){
				flag=1;
				break;
			}
			j++;
		}
		if(flag==0){
			System.out.println(str+" is a palindrome");
		}
		else{
			System.out.println(str+" is not a palindrome");
		}
		
	}

    private static void testFib(int n){
    	int a=0;
    	int b=1;
    	System.out.print(a+"\t"+b+"\t");
    	for(int i=0;i<n;i++){
    		int c=a+b;
    		System.out.print(c+"\t");
    		a=b;
    		b=c;
    	}
    }
 
    private static void testCommonNumbers(){
    	
    	int []a={1,3,9,20, 25};
    	int []b={5,25,6,1,13};
    	int []d=new int[a.length];
    	int k=0;
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i:a){
    		for(int j=0;j<b.length;j++){
    			if(i==b[j]){
    				list.add(i);
    				d[k]=i;
    				k++;
    				break;
    			}
    		}
    	}
    	
    	for(int i:d){
    		System.out.println(i);
    	}
    	
    	System.out.println(list.toArray());
    	Object []c=list.toArray();
    	for(Object i:c){
    		System.out.println(i);
    	}
    }
 
    private static void testReverseWordsOfAString(String str){
    	String []strarray=str.split(" ");
    	String str1="";
    	for(String st:strarray){
    		str1=str1.concat(reverse(st)+" ");
    	}
    	System.out.println(str1);
    	//reverse a string
    	String str2="";
    	for(int i=strarray.length-1;i>=0;i--){
    		str2=str2.concat(strarray[i]+" ");
    	}
    	System.out.println(str2);
    }
    
    private static String reverse(String str){
    	char ch[]=str.toCharArray();
    	String st="";
    	for(int i=ch.length-1;i>=0;i--){
    		st=st.concat(Character.toString(ch[i]));
    	}
    	return st;
    }

    private static void testWordCount(String str){
    	String []strarray=str.split(" ");
    	int count=1;
    	Map<String, Integer> m1=new HashMap<String, Integer>();
    	for(String st:strarray){
    		if(m1.containsKey(st)){
    			m1.put(st, m1.get(st)+1);
    		}
    		else{
    			m1.put(st, count);
    		}
    	}
    	
    	Iterator it=m1.entrySet().iterator();
    	while(it.hasNext()){
    		System.out.println(it.next());
    	}
    }

    private static void testSumOfDigits(int n){
    	int r, sum=0;
    	int temp=n;
    	while(n>0){
    		r=n%10;
    		sum+=r;
    		n=n/10;
    	}
    	System.out.println("sum of digits of "+temp+" is="+sum);
    }
 
    private static void testReadExcel(String filePath, String sheetName) throws IOException{
    	File file=new File(filePath);
    	FileInputStream fis=new FileInputStream(file);
    	XSSFWorkbook workbook=new XSSFWorkbook(fis);
    	XSSFSheet worksheet=workbook.getSheet(sheetName);
    	Iterator<Row> rowIterator=worksheet.rowIterator();
    	while(rowIterator.hasNext()){
    		Row row=rowIterator.next();
    		Iterator<Cell> cellIterator=row.cellIterator();
    		while(cellIterator.hasNext()){
    			Cell cell=cellIterator.next();
    			System.out.print(new DataFormatter().formatCellValue(cell)+"\t");
    		}
    		System.out.println();
    	}  
    }
    
    private static void testReadExcel1(String filePath, String sheetName) throws IOException{
    	File file=new File(filePath);
    	FileInputStream fis=new FileInputStream(file);
    	XSSFWorkbook workbook=new XSSFWorkbook(fis);
    	XSSFSheet worksheet=workbook.getSheet(sheetName);
    	int rowCount=worksheet.getPhysicalNumberOfRows();
    	int cellCount=worksheet.getRow(0).getLastCellNum();
    	XSSFRow row;
    	XSSFCell cell;
    	for(int i=0;i<rowCount;i++){
    		row=worksheet.getRow(i);
    		for(int j=0;j<cellCount;j++){
    			cell=row.getCell(j);
    			System.out.print(new DataFormatter().formatCellValue(cell)+"\t");
    		}
    		System.out.println();
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }
