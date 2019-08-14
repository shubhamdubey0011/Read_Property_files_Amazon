
package com.amazon.utils;

public class B {

	int count;

	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {

		B obj = new B();
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				obj.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				obj.increment();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("count: " + obj.count);

	}

}
