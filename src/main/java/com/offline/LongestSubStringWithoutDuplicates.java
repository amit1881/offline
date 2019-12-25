package com.offline;

import java.util.LinkedHashMap;

public class LongestSubStringWithoutDuplicates 
{  
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray
         
        char[] charArray = inputString.toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, repositioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }

    static void longestUniqueSubString(String str){
    	char[] ch=str.toCharArray();
    	String longestSubString = null;
    	int longestSubStringLength=0;
    	LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<Character, Integer>();
    	
    	for(int i=0;i<ch.length;i++){
    		if(lhm.containsKey(ch[i])){
    			i=lhm.get(ch[i]);
    			lhm.clear();
    		}
    		else{
    			lhm.put(ch[i], i);
    		}
    		
    		if(lhm.size()>longestSubStringLength){
    			longestSubStringLength=lhm.size();
    			longestSubString=lhm.keySet().toString();
    		}
    	}
    	
    	System.out.println("Input String : "+str);
        
        System.out.println("The longest substring : "+longestSubString);
         
        System.out.println("The longest Substring Length : "+longestSubStringLength);
    }
    
    public static void main(String[] args) 
    {   
    	longestUniqueSubString("amita");
         
        System.out.println("==========================");
         
        longestSubstring("thelongestsubstring");
    }   
}
