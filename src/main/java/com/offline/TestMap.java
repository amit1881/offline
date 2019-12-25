package com.offline;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> ma=new HashMap<Integer,String>();
		ma.put(1, "a");
		ma.put(2, "b");
		ma.put(3, "c");
		
		System.out.println(ma.get(2));
		
		for(Entry<Integer,String> en:ma.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		System.out.println();
		
		HashMap<Integer,String> hma=new HashMap<Integer,String>();
		hma.put(1, "a");
		hma.put(2, "b");
		hma.put(3, "c");
		
		System.out.println(hma.get(3));
		
		for(Entry<Integer,String> en:hma.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println("HASHMAP INTO ANOTHER HASHMAP");
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(4, "d");
		hmap.putAll(hma);
		for(Entry<Integer,String> en:hmap.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		
		System.out.println();
		
		String str="this is a laptop";
		String []a=str.split(" ");
//		for(String str1:a){
//			System.out.println(str1);
//		}
		
		String rstring="";
		String rwords="";
		for(int i=0;i<a.length;i++){
			char []b=a[i].toCharArray();
			for(int j=b.length-1;j>=0;j--){
				rstring+=b[j];
				
			}
			rstring+=" ";
			//System.out.println(rstring);
			//rwords+=rstring.concat(" ");
		}
		//rwords+=rstring;
		System.out.println(rstring);
		
	}

}
