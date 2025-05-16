package com.loop.practice;

import java.util.Scanner;

public class LoopEx {
	
	int in;
	Scanner sc = new Scanner(System.in);
	
	public void method0() {
		// 2단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println(i + " ");
		}
	}
	
	public void method1() {
		
		int sum = 0;
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		in = sc.nextInt();
		
		if(in <= 0)
			System.out.println("잘못입력하셨습니다.");
		else {
			for(int i = 1; i <= in; i++) {
				System.out.println(i);
				sum += i;
			}
			System.out.println("1부터 입력값까지의 합: " + sum);
		}
		
	}
	
	public void method2() {
		
		int sum = 0;
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		in = sc.nextInt();
		
		while(true) {
			if(in <= 0) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
				in = sc.nextInt();
			}
			else {
				for(int i = 1; i <= in; i++) {
					System.out.println(i);
					sum += i;
				}
				System.out.println("1부터 입력값까지의 합: " + sum);
				break;
			}
		}
	}
	
	public void method3() {
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		in = sc.nextInt();
		
		if(in <= 0)
			System.out.println("잘못입력하셨습니다.");
		else {
			for(int i = in; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}
	
	public void method4() {
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		in = sc.nextInt();
		
		while(true) {
			if(in <= 0) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
				in = sc.nextInt();
			}
			else {
				for(int i = in; i >= 1; i--) {
					System.out.println(i);
				}
				break;
			}
		}
	}
	
	public void method5() {
		
		int sum = 0;
		
		System.out.println("정수를 입력하세요: ");
		in = sc.nextInt();
		
		if(in <= 0)
			System.out.println("잘못입력하셨습니다.");
		else {
			for(int i = 1; i <= in; i++) {
				if(i == in)
					System.out.printf("%d ", i);
				else
					System.out.printf("%d + ", i);
				sum += i;
			}
			System.out.println("= " + sum);
		}
	}
	
	public void method6() {
		
		int in2;
		
		System.out.println("첫번째 숫자: ");
		in = sc.nextInt();
		System.out.println("두번째 숫자: ");
		in2 = sc.nextInt();
		
		if(in <= 0 || in2 <= 0)
			System.out.println("1이상의 숫자만 입력해주세요");
		else {
			if(in < in2) {
				for(int i = in; i <= in2; i++) {
					System.out.println(i);
				}
			}
			else {
				for(int i = in2; i <= in; i++) {
					System.out.println(i);
				}
			}
		}
	}
	
	public void method7() {
		
		int in2;
		
		System.out.println("첫번째 숫자: ");
		in = sc.nextInt();
		System.out.println("두번째 숫자: ");
		in2 = sc.nextInt();
		
		while(true) {
			if(in <= 0 || in2 <= 0) {
				System.out.println("1이상의 숫자만 입력해주세요");
				System.out.println("첫번째 숫자: ");
				in = sc.nextInt();
				System.out.println("두번째 숫자: ");
				in2 = sc.nextInt();
			}
			else {
				if(in < in2) {
					for(int i = in; i <= in2; i++) {
						System.out.println(i);
					}
				}
				else {
					for(int i = in2; i <= in; i++) {
						System.out.println(i);
					}
				}
				break;
			}
		}
	}
	
	public void method8() {
		
		System.out.printf("숫자: ");
		in = sc.nextInt();
		System.out.printf("%d\n", in);
		System.out.println("======"+ in +"단======");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", in, i, (in * i));
		}
	}
	
	public void method9() {
		
		System.out.printf("숫자: ");
		in = sc.nextInt();
		System.out.printf("%d\n", in);
		if(in <= 9 && in >= 2) {
			for(int i = in; i <= 9; i++) {
				System.out.println("======"+ i +"단======");
				for(int a = 1; a <= 9; a++) {
					System.out.printf("%d * %d = %d\n", i, a, (i * a));
				}
			}
		}
		else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void method10() {
		
		System.out.printf("숫자: ");
		in = sc.nextInt();
		System.out.printf("%d\n", in);
		for(int z = 0; true; z++) {
			if(in <= 9 && in >= 2) {
				for(int i = in; i <= 9; i++) {
					System.out.println("======"+ i +"단======");
					for(int a = 1; a <= 9; a++) {
						System.out.printf("%d * %d = %d\n", i, a, (i * a));
					}
				}
				break;
			}
			else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
				sc.nextLine();
				System.out.printf("숫자: ");
				in = sc.nextInt();
				System.out.printf("%d\n", in);
				continue;
			}
		}
	}
	
	public void method11() {
		
		int in2;
		
		System.out.println("시작 숫자: ");
		in = sc.nextInt();
		System.out.println("공차: ");
		in2 = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(in);
			in += in2;
		}
	}
}
