package com.offline;

class S extends Thread{
	private static S ob=null;
	
	String str;
	private S(){
		str="singleton class";
	}
	public synchronized static S getInstance(){
		if(ob==null){
			ob=new S();
		}
		return ob;
	}
	
	public void run(){
		synchronized(this){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		}
	}
}


public class TestSingleton{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s1=S.getInstance();
		S s2=S.getInstance();
		S s3=S.getInstance();
		
		s1.str=s1.str.toUpperCase();
		System.out.println("for s1 instance::"+s1.str);
		System.out.println("for s2 instance::"+s2.str);
		System.out.println("for s3 instance::"+s3.str);
		System.out.println();
		Thread t1=new Thread(s1,"thread 1 acting on object s1");
		Thread t2=new Thread(s1,"thread 2 acting on object s1");
		t1.start();
		t2.start();
	}

}
