package com.zafar.thread.sleep;

public class SleepMethodWithRunable implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);// this will stop for 1 second
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		SleepMethodWithRunable methodWithRunable = new SleepMethodWithRunable();
		Thread thread = new Thread(methodWithRunable);
		thread.start();

	}
}
