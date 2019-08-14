package com.amazon.utils;

public class test {

	public static void main(String[] args) throws InterruptedException {
		Runnable objA = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("in A run");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable objB = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("in B run");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(objA);
		Thread t2 = new Thread(objB);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
//		System.out.println(t1.isAlive());
		System.out.println("ABC");
		
	}

}
