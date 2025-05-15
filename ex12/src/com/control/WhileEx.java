package com.control;

import java.util.Scanner;

public class WhileEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		/*
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// 1부터 랜덤값(1 ~ 10)까지의 합계
		// Math.random(); : 0.0 ~ 1.0 사이의 실수값을 반환
		while(i <= 6) {
			System.out.println((int)(Math.random() * 45) + 1);
			i++;
		}
		*/
		// 사용자에게 ID를 입력 받고 출력 하세요(횟수)
		String id;
		
		while(true) {
			System.out.println("아이디를 입력해주세요");
			id = sc.next();
			if(id.equals("x"))
				break;
			System.out.println(id + " (" + i + ")");
			i++;
		}
		
	}
}
