package com.amazon.utils;

@FunctionalInterface
public interface ABC {
	void show();
	default void run() {
		System.out.println("in run");
	}
	default void runs() {
		System.out.println("in runs");
	}
	
}
