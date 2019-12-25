package com.testmock;

public class AddServiceImpl implements AddService {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("**--- AddServiceImpl add executed ---**");
		return num1 + num2;
	}

}
