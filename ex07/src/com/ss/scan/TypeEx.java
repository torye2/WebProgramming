package com.ss.scan;

import java.util.Scanner;

public class TypeEx {
	
	public static void main(String[] args) {
		// 1. 생성
		TypeEx te = new TypeEx();
		te.declear();
		te.inputByScanner();
		te.inputByScanner2();
		te.autoCasting();
		te.declear();
	}

	private void declear() {
		/*
		 * 변수의 선언
		 * 		자료형(타입) 변수명;
		 * 변수의 값을 할당
		 * 		변수명 = 값(리터럴);
		 * 		메모리에 올라간다 -> 값을 할당하기 전에는 사용할 수 없다.
		 * 변수의 선언 + 할당
		 * 		자료형(아팁) 변수명 = 값;
		 * 
		 * (=) 대입연산자
		 * 		오른쪽에 있는 값을 왼쪽에 대입
		 */
		
		// 변수명이 num인 정수형 변수를 선언해봅시다.
		int num;
		num = 1;
		
		// 중복되는 이름 사용 불가
		// ex) char num = 1;
		
		// 논리값 isTrue값을 선언하고 초기값을 false로 지정하세요
		boolean isTrue = false;
		isTrue = true;
		
		// 실수값을 저장 할 수 있는 변수를 선언하고 초기값을 3.14로 지정하세요
		double pie = 3.14;
		
		// name 변수를 선언하고 삼성캠퍼스를 입력하고 출력 해봅시다
		String name = "삼성캠퍼스";
		// 이스케이프 문자
		name = "\"" + name + "\"";
		
		System.out.println(name);
		
		// 문자열에 숫자가 저장된 경우 -> 연산이 불가능
		// 연산을 하기 위해서는 형변환을 해야한다
		String str = "10";
		// 래퍼클래스 : 기본타입의 객체형
		// 문자를 숫자로 형변환 하는 방법
		int num2 = Integer.parseInt(str);
		
		//System.out.println(str);
		
		/* 변수의 명명 규칙
		 * 1. 대소문자 구분
		 * 2. 예약어를 사용할 수 없다
		 * 3. 숫자로 시작할 수 없다.
		 * 4. 특수문자는 '_', '$'만 사용이 가능합니다.
		 */
		int Age;
		int age;
		int _age;
		int $_age;
		// int 1age; -> 숫자가 앞에 올 수 없다
		// int #age; -> 특수문자는 _, $만 사용 가능
		// int class; -> 예약어 사용 불가

	}
	
	private void inputByScanner() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 문자열, 정수, 실수의 입력을 받아서 반환하는 역할
		 * 
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (문자열)
		 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		 * scanner.nextInt() : 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
		 * ... 그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXX()로 입력받으면 된다. 
		 */ 
		
		String str = scan.next();
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.next();
		
		System.out.println("str : " + str);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		// str3을 입력하면서 엔터가 버퍼에 남아있어서 nextLine() 메서드를 이용해서
		// 엔터를 제거 후 다음 입력을 받을 수 있다
		String str4 = scan.nextLine();
		// a b c d
		String str5 = scan.nextLine();
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		
		scan.close();

	}
	
	private void inputByScanner2() {
		String name;
		int age;
		double height;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 :");
		name = scan.next();
		System.out.println("나이 :");
		age = scan.nextInt();
		System.out.println("키 :");
		height = scan.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1f입니다.", name, age, height);
		scan.close();

	}
	
	/*
	 * 형변환
	 * 
	 * - 자동 형변환 (묵시적 형변환)
	 * 		개발자가 신경쓸 필요가 없다
	 * 		데이터 표현 범위가 작은 자료형이 큰 자료형으로 변환될 때 발생
	 * 		ex) int -> double
	 * - 강제 형변환 (명시적 형변환)
	 * 		(타입) 값;
	 * 		강제 형변환의 경우 데이터의 손실이 발생할 수 있다
	 */
	private void autoCasting() {
		int height = 163;
		
		// 묵시적 형변환
		double h = height; // 163.0
		System.out.println("h : " + h);
		
		// int/int = int
		// int/double = double
		// 연산 시 타입이 일치해야 연산이 가능 -> double/double = double
		double height_m = 163/100.0;
		System.out.println("height_m : " + height_m);
		
		// 명시적 형변환
		height = (int)height_m;
	}
}
