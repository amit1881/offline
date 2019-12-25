package com.offline;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 92, 14, 46, 47, 86, 92, 52, 48, 36, 66, 85, 92, 86, 85, 87, -1 };
		int arr1[] = { -1, -2, -3, -4, -5 };
		int arr2[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85, -99, -88, 92 };
		int[] a = {-5, -4, 0, 2, 10, 30, -3};
		// int largest = 0;
		// int secondLargest = 0;

		int largest = arr[0];
		int secondLargest = arr[1];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] == largest) {
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

		SecondLargest ob = new SecondLargest();
		ob.secondLargest(arr1);
		ob.secondLargest(arr2);
		ob.maxMin(arr);
		ob.secondSmallest(arr);
		ob.secondSmallest(a);

	}

	void secondLargest(int arr[]) {
		int largest = arr[0];
		int secondLargest = arr[1];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] == largest) {
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);
	}

	void maxMin(int a[]) {
		int max = a[0];
		int min = a[0];
		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}

		System.out.println("Max=" + max);
		System.out.println("Min=" + min);
	}

	void secondSmallest(int a[]) {
		int smallest = a[0];
		int secondSmallest = a[1];

		for (int i : a) {
			if (i < smallest) {
				secondSmallest = smallest;
				smallest = i;
			} else if (i == smallest) {
				smallest = i;
			} else if (i < secondSmallest) {
				secondSmallest = i;
			}
		}

		System.out.println("Second Smallest Number is::" + secondSmallest);
	}

}
