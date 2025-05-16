package com.operator.practice;

public class OperatorEx {
	/*
	 * 비교 연산자(관계 연산자) : boolean
	 *  - 두 값을 비교하는 연산자
	 *  - 비교 연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환
	 *  
	 *  a < b
	 *  a > b
	 *  a <= b
	 *  a >= b
	 *  a == b
	 *  a != b
	 */
	public void method1() {
		// 타입이 같은 여러개의 변수를 선언하는 방법
		int num1;
		int num4 = 1;
		
		num1 = 2;
		// != : 조건이 거짓이면 코드블럭을 실행한다
		if(num1 != num4)
			System.out.println("num1 != num4");
	}
	
	/*
	 * 복합 대입 연산자
	 *  - 다른 연산자와 대입 연산자를 함께 사용하는 연산자로 내부적으로 연산 처리 속도가 빠르므로 사용을 권장한다.
	 *    (메모리에서 직접 연산을 수행한다.)
	 *  - 증감 연산자(++, --)와 비슷해 보이지만 증감 연산자는 값을 1씩만 증감이 되고 복합 대입 연산자는
	 *    내가 원하는 숫자만큼 값을 증감 시킬 수 있다.
	 *    
	 *  +=, -=, *=, /=, %=
	 * 
	 *  a = a + 3;	=>	a += 3;
	 *  a = a - 3;	=>	a -= 3;
	 *  a = a * 3;	=>	a *= 3;
	 *  a = a / 3;	=>	a /= 3;
	 *  a = a % 3;	=>	a %= 3;
	 * 
	 */
	public void method2() {
		int num = 12;
		// num 변수에 값을 3 증가 시킨다
		num = num + 3;
		System.out.println("num = num + 3 : " + num);
		num += 3;
		System.out.println("num += 3 : " + num);
		
		// -5
		num -= 5;
		System.out.println("num -= 5 : " + num);
		// *2
		num *= 2;
		System.out.println("num *= 2 : " + num);
		// /2
		num /= 2;
		System.out.println("num /= 2 : " + num);
		// %3
		num %= 3;
		System.out.println("num %= 3 : " + num);
	}
}
