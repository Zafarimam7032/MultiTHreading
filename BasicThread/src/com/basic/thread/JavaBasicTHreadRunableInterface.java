package com.basic.thread;

public class JavaBasicTHreadRunableInterface implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread in java by using runable interface : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}
	public static void main(String[] args) {
		JavaBasicTHreadRunableInterface basicTHreadRunableInterface=new JavaBasicTHreadRunableInterface();
		
		Thread thread=new Thread(basicTHreadRunableInterface);
		thread.start();
	}

}
