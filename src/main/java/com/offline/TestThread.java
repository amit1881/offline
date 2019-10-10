package com.offline;


class TestRunnable implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		display();
	}
	//Synchronized method
	private synchronized void display(){
		System.out.println("implementing runnable run method");
		System.out.println("multithreading");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	}
	
}

class TestMultiThread implements Runnable{

	private int a,b;
	TestMultiThread(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		sum();
	}
	
	private void sum(){
		System.out.println(a+b);
	}
}

public class TestThread extends Thread{
	
	public void run(){
		//Synchronized Block
		synchronized (this) {
			System.out.println("multithreading");
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getName());	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThread ob=new TestThread();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob,"second thread");
		t1.start();
		t2.start();
		//t2.run();
		/*
		 * if we call the run() method instead of start() method
		 * multithreading
		Thread[main,5,main]
		main
		that means in this case with run method, main thread executes
		 */
		//t2.start();
		/*
		 * if we start a thread twice
		 * Exception in thread "main"
	java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Unknown Source)
	at com.offline.TestThread.main
		 */
		
		System.out.println("-------------------------");
		
		TestRunnable ob1=new TestRunnable();
		Thread t3=new Thread(ob1);
		Thread t4=new Thread(ob1,"fourth thread");
		t3.start();
		t4.start();
		
		System.out.println();
		
		TestMultiThread ob3=new TestMultiThread(10, 20);
		TestMultiThread ob4=new TestMultiThread(100, 200);
		Thread t5=new Thread(ob3,"thread5");
		Thread t6=new Thread(ob4,"thread6");
		t5.start();
		t6.start();
	}

}
