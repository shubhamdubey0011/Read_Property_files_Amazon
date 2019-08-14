package com.amazon.utils;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		
		Refer r = new Refer();

		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		
		//values.forEach(r::run);
		
		System.out.println(values.stream().map(i->i*2).reduce(0,(i,j)->i+j));
		
		
	}

}
