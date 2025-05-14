package com.operator.practice;

import java.util.Scanner;

public class OperatorEx {
	
	Scanner sc = new Scanner(System.in);
	int num1 = 0, num2 = 0;
	
	public void method1() {
		
		System.out.println("정수를 입력해주세요");
		num1 = sc.nextInt();
		
		if(num1 > 0)
			System.out.println("양수다");
		else
			System.out.println("양수가 아니다");
	}
	
	public void method2() {
		
		System.out.println("정수를 입력해주세요");
		num1 = sc.nextInt();
		
		String result = num1 > 0 ? "양수다" : num1 == 0 ? 
				"0이다" : "음수다";
		System.out.println(result);
	}
	
	public void method3() {
		
		System.out.println("정수를 입력해주세요");
		num1 = sc.nextInt();
		
		if(num1 % 2 == 0)
			System.out.println("짝수다");
		else
			System.out.println("홀수다");
	}
	
	public void method4() {
		
		int num3 = 0;
		int num4 = 0;
		
		System.out.println("인원수를 입력해주세요");
		num1 = sc.nextInt();
		System.out.println("사탕의 개수를 입력해주세요");
		num2 = sc.nextInt();
		
		num3 = num2 / num1;
		num4 = num2 % num1;
		
		System.out.printf("1인당 받은 사탕의 개수 : %d개" ,num3);
		System.out.printf("나눠주고 남은 사탕의 개수 : %d개" ,num4);
	}
	
	public void method5() {
		
		System.out.println("나이를 입력해주세요");
		num1 = sc.nextInt();
		
		if(num1 <= 13)
			System.out.println("어린이");
		else if(num1 <= 19)
			System.out.println("청소년");
		else
			System.out.println("성인");
	}
	
	public void method6() {
		
		int num3 = 0;
		
		System.out.println("3개의 정수를 입력해주세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 == num2 && num1 == num3)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
