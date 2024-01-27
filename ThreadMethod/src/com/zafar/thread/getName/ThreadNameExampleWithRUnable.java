package com.zafar.thread.getName;

public class ThreadNameExampleWithRUnable implements Runnable{
	
	
	@Override
	public void run() {
		System.out.println("run Method");
	}

	public static void main(String[] args) {
		ThreadNameExampleWithRUnable example=new ThreadNameExampleWithRUnable();
		Thread thread2=new Thread(example);
		System.out.println(thread2.getName());
	}

}
