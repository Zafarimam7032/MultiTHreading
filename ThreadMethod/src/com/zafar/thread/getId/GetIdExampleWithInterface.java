package com.zafar.thread.getId;

public class GetIdExampleWithInterface implements Runnable {
	
	
	@Override
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		
		GetIdExampleWithInterface class1=new GetIdExampleWithInterface();
		Thread thread2=new Thread(class1);
		System.out.println(thread2.getId());
	}

}
