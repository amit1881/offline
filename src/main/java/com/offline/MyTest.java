package com.offline;

public class MyTest {

	public static void main(String ar[]) {
		int num = 3;
		System.out.print(num + " ");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 1) {
					num = num + 3;
					System.out.print(num + " ");
				} else {
					num = num + 2;
					System.out.print(num + " ");
				}
			}
		}
	}
}
