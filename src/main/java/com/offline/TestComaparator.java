package com.offline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
	String name;
	int price;

	Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Book b1 = (Book) ob1;
		Book b2 = (Book) ob2;
		return b1.name.compareTo(b2.name);
	}
}

class PriceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		if (b1.price == b2.price)
			return 0;
		else if (b1.price > b2.price)
			return 1;
		else
			return -1;
	}

}

public class TestComaparator {
	
	public static void main(String a[]){
		
		List<Book> book=new ArrayList<Book>();
		book.add(new Book("java", 500));
		book.add(new Book("groovy", 200));
		book.add(new Book("c sharp", 800));
		book.add(new Book("js", 650));
		Collections.sort(book, new NameComparator());
		for(Book b:book){
			System.out.println(b.name+"\t"+b.price);
		}
		System.out.println("----------------------");
		Collections.sort(book, new PriceComparator());
		for(Book b:book){
			System.out.println(b.name+"\t"+b.price);
		}
	}

}
