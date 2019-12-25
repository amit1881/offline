package com.offline;

public class TestPattern {
	
	public static void main(String a[]){
		
		int k=1;
		for(int i=1;i<=4;i++){//1st loop corresponds to row
			for(int j=1;j<=i;j++){//2nd loop corresponds to column
				System.out.print(k++ + "\t");
			}
			System.out.println();
		}
		
		
		char []arr1={'a','b','c','d','e'};
		int []arr2={1,2,3,4,5};
		//int j=0;
		for(int i=4;i>=0;i--){
			System.out.print(arr1[i]);
			System.out.print(arr2[4-i]+"\t");
			//j++;
		}
	}

}
