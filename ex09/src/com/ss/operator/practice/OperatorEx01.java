package com.ss.operator.practice;

public class OperatorEx01 {
	/*
	 * 논리 부정 연산자
	 * 
	 * !논리값(true, false)
	 * 		-> 논리값을 반대로 바꾸는 연산자
	 */
	public void method01() {
		boolean isTrue = false;
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
		
		isTrue = !isTrue;
		
		// 조건이 참이 아니면 코드 블럭을 실행
		if(!true) {
			
		}
		
		System.out.println(!false);
	}
	
	/*
	 * 증감 연산자
	 * 
	 * 	(증감연산자)값; : 연산을 먼저
	 * 	값(증감연산자);  : 다음 행으로 넘어가면 값이 증가
	 * 
	 * 	- 증감연산자는 피연산자의 값을 1씩 증가시키거나 1씩 감소시키는 역할
	 * 	- ++ : 1씩 증가
	 *  - -- : 1씩 감소
	 *  
	 */
	public void method2() {
		int num = 10;
		
		System.out.println("num : " + num);
		// 전위 연산자
		System.out.println("++num : " + ++num);
		// 후위 연산자
		System.out.println("num++ : " + num++);
		System.out.println("num : " + num);
	}
	
	/*
	 * 산술연산자
	 * 	+, -, *, /(나누기), %(나머지)
	 */
	public void method3() {
		int num = 10;
		int num1 = 3;
		
		int res;
		res = num % num1;
		System.out.println("res : " + res);
		
		// 정수끼리 연산 시 실수타입으로 받고 싶은 경우
		// 1. 정수와 정수의 연산 결과는 정수 타입을 반환하므로
		// 어느 한쪽을 실수로 형 변환 후 연산을 진행
		
		// 강제 형변환
		double res_d = (double)num / num1;
		System.out.println("res_d : " + res_d);
		
		// 2. 자동형변환을 유도
		res_d = num * 1.0;
		
		// 예외가 발생하는 경우
		System.out.println(5 / 0.0); // Infinity(무한대) 결과값 출력
		// 연산 결과가 무한대인지 확힌하는 방법
		System.out.println("검증 : " + Double.isInfinite(5/0.0));
		// System.out.println(5 / 0); // 예외 - 프로그램 종료
		
	}
}
