package com.chap4.method;

import java.util.Arrays;

public class Overloading {
	
	/*
	 * 메서드의 오버로딩
	 * 	- 한 클래스내에 같은 이름의 메서드를 여러개 정의하는 것
	 * 	- 매개변수의 자료형 개수와 순서가 다르게 작성되어야 한다
	 * 	- 매개변수명, 접근제한자, 반환타입은 영향을 주지 않는다
	 * 	- 호출 시 전달되는 파라메터의 개수, 타입에 따라 실행되는 메서드가 결정된다
	 */
	public void test() {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/* 변수명만 다른 것은 안된다
	public void test(int num1, int num2) {
		
	}*/
	// 생성자의 오버로딩
	public Overloading() {
		
	}
	
	public Overloading(int a) {
		
	}
	
	public Overloading(int a, int b) {
		
	}
	
	// 5. 매개변수로 객체를 전달 받는 메서드
	// 매개변수로 객체가 전달되거나 객체가 반환되는 경우
	// 객체의 참조값(주소)가 전달된다
	public User method5(User user) {
		user.setAge(4);
		user.setName("뽀로로");
		
		return user;
	}
	
	// 6~7. 매개변수가 가변인자인 경우
	// 가변인자는 매개변수의 맨 마지막에 위치해야한다
	// java 1.5부터 지원
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	public void method7(String name, int ... numbers) {
		System.out.println(name);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
}