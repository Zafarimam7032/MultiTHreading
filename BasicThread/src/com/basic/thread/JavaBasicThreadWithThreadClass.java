package com.basic.thread;

public class JavaBasicThreadWithThreadClass extends Thread {

	
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		JavaBasicThreadWithThreadClass basicThreadWithThreadClass=new JavaBasicThreadWithThreadClass();
		basicThreadWithThreadClass.start();
	}
}
