package com.offline;

class TestSort{
	int max;
	public void sort(int b[],int nmax){
		for(int i=0;i<b.length;i++){
			for(int k=i+1;k<b.length;k++){
				if(b[i]<b[k]){
					max=b[k];
					b[k]=b[i];
					b[i]=max;
				}
			}
		}
		
		System.out.println();
		for (int i : b){
			System.out.print(i+" ");
		}
		int sum=0;
		for(int i=0;i<nmax;i++){
			sum=sum+b[i];
		}
		System.out.println("\n"+sum);
	}
	
	
}

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ex. A = {-8,-5,-3,-1,3,6,9}
Output: {-1,-3,3,-5,6,-8,9}
		 * 
		 */
		
		int array1[] = {-8,-5,-3,-1,3,6,9};
		int array3[] = {8,5,3,1,3,6,9};
		int array2[] = new int[7];
		int j=0;
		for(int i : array1){
			array2[j]=Math.abs(i);
			j++;
		}
		
		for (int i : array2){
			//System.out.println(i);
		}
        int temp1, temp2;
		for(int i=0;i<array1.length;i++){
			for(j=1;j<array1.length;j++){
				temp1=array1[i];
				temp2=Math.abs(array1[i]);
				if(temp2>=array1[j]){
					array1[i]=array1[j];
					array1[j]=temp1;
					
				}
			}
		}
		
		for (int i : array1){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<array3.length;i++){
			for(j=1;j<array3.length;j++){
				temp1=array3[i];
				if(temp1>=array3[j]){
					array3[i]=array3[j];
					array3[j]=temp1;
					
				}
			}
		}
		
		for (int i : array3){
			System.out.print(i+" ");
		}
		int min;
		int a[]={64,25,12,22,11};
		int b[] = {8,5,3,1,3,6,9};
		for(int i=0;i<b.length;i++){
			for(int k=i+1;k<b.length;k++){
				if(b[i]>b[k]){
					min=b[k];
					b[k]=b[i];
					b[i]=min;
				}
			}
		}
		
		System.out.println();
		for (int i : b){
			System.out.print(i+" ");
		}
		int c[]={1,2,3,4,5};
		int d[]={1,2,3,3,4};
		int e[]={0,0,1,0,0,1};
		TestSort ob=new TestSort();
		ob.sort(e,2);
	}

}
