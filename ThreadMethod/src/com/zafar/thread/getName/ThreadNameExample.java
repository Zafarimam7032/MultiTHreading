package com.zafar.thread.getName;

public class ThreadNameExample extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("run Method");
	}

	public static void main(String[] args) {
		Thread thread=new Thread();
		System.out.println(thread.getName());
		ThreadNameExample example=new ThreadNameExample();
		System.out.println(example.getName());
	}

}
