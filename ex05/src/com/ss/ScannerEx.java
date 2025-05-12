package com.ss;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// 사용자로부터 값을 입력 받아옵니다.
		System.out.println("이름: ");
		
		// 콘솔창에서 사용자의 입력을 대기
		// 사용자 값을 입력하고 엔터키를 누르면 사용자의 입력 값을 반환
		String name = scan.next();
		
		System.out.println("나이: ");
		int age = scan.nextInt();
		
		System.out.println("키: ");
		int height = scan.nextInt();
		
		System.out.println("몸무게: ");
		int weight = scan.nextInt();
		
		System.out.println("취미: ");
		String hobby = scan.next();
		
		// 예외처리
		// 프로그램이 비정상적으로 종료 되지 않도록 하는 처리
		
		System.out.println("================");
		System.out.println("사용자 정보");
		System.out.println("이름은: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("취미: " + hobby);
		
		scan.close();
	}
	
}
