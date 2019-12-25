package com.offline;

public class TestMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,5,4,6,3,9,10,7};
		int sum10=10*(10+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("Missing number is::"+(sum10-sum));
		
		TestMissingNumber ob=new TestMissingNumber();
		int mn=ob.missingNumber(a);
		System.out.println(mn);
	}
	
	int missingNumber(int a[]){
		int noe=a.length+1;
		int total=noe*(noe+1)/2;
		int sum=0;
		for(int i:a){
			sum+=i;
		}
		return total-sum;
	}

}
