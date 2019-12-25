package com.offline;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * Hello world!
 *
 */

class Check{
	static void charFrequencey(String str){
		char[] ch=str.toCharArray();
		int count=1;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, count);
			}
		}
		
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		System.out.println("Count of characters::");
		Iterator<Entry<Character,Integer>> it=hm.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	static void wordReverse(String str){
		System.out.println("Reversed String::");
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
		System.out.println();
		for(int i=ch.length-1;i>=0;i--){
			rev=rev.concat(((Character)ch[i]).toString());
		}
		
		if(str.equals(rev)){
			System.out.println(str+" is a paliandrome string");
		}
		else{
			System.out.println(str+" is not a paliandrome string");
		}
	}
	
	
	static void stringReverse(String str){
		String[] st=str.split(" ");
		String revstr="";
		for(String s:st){
			String rev="";
			char[] ch=s.toCharArray();
			for(int i=ch.length-1;i>=0;i--){
				rev=rev.concat(((Character)ch[i]).toString());
			}
			revstr=revstr.concat(rev+" ");
		}
		System.out.println("Reverse each word in a string::");
		System.out.println(revstr);
	}
	
	static void stringReverseNotWord(String str){
		String[] st=str.split(" ");
		String revstr="";
		for(int i=st.length-1;i>=0;i--){
			revstr=revstr.concat(st[i]+" ");
		}
		System.out.println("Reverse a string without reversing word::");
		System.out.println(revstr);
	}
	
	public String sendGetRequest(String apiUrl, Map<String,String> requestMap){
	
		HttpGet httpGet=null;
		HttpClient httpClient=null;
		HttpResponse httpResponse=null;
		HttpEntity httpEntity=null;
		String jsonResponse=null;
		try{
			String queryString=createQueryString(requestMap);
			URI uri=URI.create(apiUrl+"?"+queryString);
			httpGet=new HttpGet(uri);
			httpClient=new DefaultHttpClient();
			httpResponse=httpClient.execute(httpGet);
			if(httpResponse==null){
				
			}
			
			httpEntity=httpResponse.getEntity();
			jsonResponse=EntityUtils.toString(httpEntity);
		}
		catch(Exception e){
			
		}
		return jsonResponse;
	}
	
	public String sendPostRequest(String apiUrl,Map<String,String> requestMap){
		HttpPost httpPost=null;
		HttpClient httpClient=null;
		HttpResponse httpResponse=null;
		HttpEntity httpEntity=null;
		String jsonResponse=null;
		
		try{
			String queryString=createQueryString(requestMap);
			StringEntity entity=new StringEntity(queryString,ContentType.create("application/x-www-form-urlencoded", "UTF-8"));
			URI uri=URI.create(apiUrl);
			httpPost=new HttpPost(uri);
			httpPost.setEntity(entity);
			httpClient=new DefaultHttpClient();
			httpResponse=httpClient.execute(httpPost);
			if(httpResponse==null){
				
			}
			httpEntity=httpResponse.getEntity();
			jsonResponse=EntityUtils.toString(httpEntity);
		}
		catch(Exception e){
			
		}
		
		
		return jsonResponse;
	}

	private String createQueryString(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		List<String> param=new ArrayList<String>();
		for(Entry<String,String> en:requestMap.entrySet()){
		param.add(en.getKey()+"="+en.getValue());	
		}
		String requestPayload=StringUtils.join(param, "&");
		return requestPayload;
	}
	
}


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Check.charFrequencey("test automation");
        Check.wordReverse("nitin");
        Check.wordReverse("test");
        Check.stringReverse("reverse string");
        Check.stringReverse("java application programming language");
        Check.stringReverseNotWord("java application programming language");
    }
}
