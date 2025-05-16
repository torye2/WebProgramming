package com.control;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		/*
		 * 사용자로부터 과일 이름을 입력받는다.
		 * 입력된 과일의 값을 지정해서 출력한다.
		 * 지정한 과일이 없으면 "안 팔아요~" 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름 : ");
		String fruit = sc.next();
		
		switch(fruit) {
		case "복숭아" : System.out.println("복숭아는 1800원입니다."); break;
		case "사과" : System.out.println("사과는 2000원입니다."); break;
		default : System.out.println("안팔아요~"); break;
		}
		sc.close();
	}
}
