package com.offline;

public class TestOdd {
	
	
	void test(Integer num){
		if(num%2!=0){
			String str=num.toString();
			char[] ch=str.toCharArray();
			int lhs=0;
			int rhs=0;
			for(int i=0;i<ch.length/2;i++){
				Character c=(Character)ch[i];
				lhs=lhs+Integer.parseInt(c.toString());
			}
			
			for(int i=ch.length/2+1;i<ch.length;i++){
				Character c=(Character)ch[i];
				rhs=rhs+Integer.parseInt(c.toString());
			}
			System.out.println(lhs);
			System.out.println(rhs);
			
			if(lhs<rhs){
				System.out.println("lhs is less than rhs");
			}
			else
				System.out.println();
			
			
		}
	}
	
	public static void main(String a[]){
		TestOdd ob=new TestOdd();
		ob.test(1234567);
	}

}
