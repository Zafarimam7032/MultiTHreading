package com.zafar.thread.getId;

public class GetIdExampleWithThreadClass extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		
		Thread thread=new Thread();
		System.out.println(thread.getId());
		GetIdExampleWithThreadClass class1=new GetIdExampleWithThreadClass();
		System.out.println(class1.getId());
	}

}
