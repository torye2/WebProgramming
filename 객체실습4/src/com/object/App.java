package com.object;

import com.object.practice.StaticSample;

public class App {

	public static void main(String[] args) {
		
		StaticSample.setValue("Java");
		
		StaticSample.toUpper();
		System.out.println(StaticSample.getValue());
		
		StaticSample.setChar(2, 'B');
		System.out.println(StaticSample.getValue());
		
		System.out.println(StaticSample.valueLength());
		
		System.out.println(StaticSample.valueConcat("PROGRAMMING"));
		
	}

}
