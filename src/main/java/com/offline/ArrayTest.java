package com.offline;

import java.util.*;
import java.util.Iterator;
import java.io.*;

class TestReverseArray {
	char[] ch = { 's', 't', 'r', 'i', 'n', 'g' };
	int j = 0;

	void testReverseArray() {
		for (int i = ch.length - 1; i >= 0; i--) {
			if (j < i) {
				char temp = ch[j];
				ch[j] = ch[i];
				ch[i] = temp;
				j++;
				// System.out.print(ch[i]);
			}
		}
		System.out.println(ch);
	}
}

public class ArrayTest {

	public static void main(String args[]) throws NumberFormatException, IOException {

		TestReverseArray ob = new TestReverseArray();
		ob.testReverseArray();
		int[] a = { 2, 4, 6, 10 };
		int[] b = new int[5];
		b[0] = 1;
		b[1] = 3;
		b[2] = 5;
		b[3] = 7;
		b[4] = 9;

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		System.out.println("array list:" + al);

		ArrayList<Integer> bal = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			bal.add(b[i]);
		}

		Iterator it = bal.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// test("Calling from main");
		// ArrayTest.test("calling using class");
		// ArrayTest ob = new ArrayTest();
		// ob.test("calling using object");
		testFactorial(6);
		int fact = testRec(5);
		System.out.println("factorial=" + fact);
	}

	private static void test(String test) throws NumberFormatException, IOException {
		System.out.println(test + " test method");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a no of elements in fib series::");
		int noe = Integer.parseInt(br.readLine());
		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2);
		int count = 2;
		int sum;
		while (count < noe) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
			count++;
		}

	}

	private static void testFactorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("factorial of " + n + "=" + fact);
	}

	private static int testRec(int n) {
		int fact;
		if (n == 1)
			return 1;
		fact = n * testRec(n - 1);
		return fact;

	}
}
