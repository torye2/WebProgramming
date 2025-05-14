package com.var.practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VarEx {
	
	Scanner scan = new Scanner(System.in);

	public void input() {// 스캐너를 이용하여 사용자의 입력을 받아 변수에 저장하고 출력
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Character> genders = new ArrayList<Character>();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Double> heights = new ArrayList<Double>();
		String name;
		char gender;
		int age;
		double height;
		
		while(true) {
			
			System.out.println("이름(x를 입력하면 종료): ");
			name = scan.next();
			if(name.equals("x")) {
				System.out.println("입력을 종료하고 리스트를 출력합니다.");
				break;
			}
			System.out.println("성별: ");
			gender = scan.next().charAt(0);
			
			try {
				System.out.println("나이: ");
				age = scan.nextInt();
				System.out.println("키: ");
				height = scan.nextDouble();
				
				names.add(name);
				genders.add(gender);
				ages.add(age);
				heights.add(height);
				
				System.out.printf("%s\t%c\t%d\t%.1f\n", name, gender, age, height);
				
			} catch(InputMismatchException e) {
				System.out.printf("잘못 입력하셨습니다. 다시 시도해주세요\n");
				e.printStackTrace();
				scan.nextLine();
			}
		}
		
		System.out.println("[USER LIST]");
		System.out.println("이름\t성별\t나이\t키");
		for(int i = 0; i < names.size(); i++) {
			System.out.printf("%s\t%c\t%d\t%.1f\n", names.get(i),
					genders.get(i), ages.get(i), heights.get(i));
		}
		
	}
	
	public void math() {
		// 키보드로 정수 두개를 입력 받아 두수의 사칙연산(+,-,*,/) 결과를 출력
		int n1 = 0, n2 = 0, r1, r2;
		double r3, r4;
		
		System.out.println("정수 두개를 입력해주세요: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		r1 = n1 + n2;
		r2 = n1 - n2;
		r3 = (double)n1 * n2;
		r4 = (double)n1 / n2;
		System.out.printf("%d + %d = %d\n", n1, n2, r1);
		System.out.printf("%d - %d = %d\n", n1, n2, r2);
		System.out.printf("%d * %d = %.1f\n", n1, n2, r3);
		System.out.printf("%d / %d = %.1f\n", n1, n2, r4);
		
	}
	
	public void square() {
		// 키보드로 가로, 세로 값을 입력 받아 사각형의 면적과 둘레를 출력
		int x = 0, y = 0, area, perimeter;
		
		System.out.println("가로 세로 값을 입력해주세요: ");
		x = scan.nextInt();
		y = scan.nextInt();
		area = x * y;
		perimeter = (x + y) * 2;
		
		System.out.printf("사각형의 면적: %d\n사각형의 둘레: %d\n", area, perimeter);
	}

	
}
