package com.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		int intArr[];
		intArr = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			intArr[i] = i + 1;
		}
		
		for(int n : intArr) {
			System.out.print(n + " ");
		}
	}
	
	public void method2() {
		int intArr[];
		intArr = new int[10];
		int a = 0;
		
		for(int i = 9; i >= 0; i--) {
			intArr[a] = i + 1;
			System.out.print(intArr[a] + " ");
			a++;
		}
	}
	
	public void method3() {
		int intArr[];
		System.out.println("양의 정수를 입력해주세요: ");
		int in = sc.nextInt();
		intArr = new int[in];
		
		for(int i = 0; i < in; i++) {
			intArr[i] = i + 1;
		}
		
		for(int n = 0; n < intArr.length; n++) {
			System.out.print(intArr[n] + " ");
		}
	}
	
	public void method3_() {
		int intArr[] = new int[5];
		int ran;
		
		for(int i = 0; i < intArr.length; i++) {
			ran = (int)(Math.random() * 10) + 1;
			intArr[i] = ran;
			for(int a = 0; a < i; a++) {
				if(intArr[a] == ran) {
					i--;
					break;
				}
			}
		}
		
		for(int n = 0; n < intArr.length; n++) {
			System.out.print(intArr[n] + " ");
		}
	}
	
	public void method3__() {
		System.out.println("메뉴의 갯수를 입력해주세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		String foodList[] = new String[num];
		String food;
		int a = (int)(Math.random() * num);
		
		for(int i = 0; i < foodList.length; i++) {
			System.out.println("메뉴를 입력해주세요: ");
			food = sc.next();
			foodList[i] = food;
		}
		
		System.out.println("오늘의 랜덤 메뉴: " + foodList[a]);
	}
	
	public void method4() {
		String fruit[] = {"사과", "블루베리", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
	}
	
	public void method5() {
		String Day[] = {"월", "화", "수", "목", "금", "토", "일"};
		int in;
		
		System.out.println("0 ~ 6 사이 숫자 입력: ");
		in = sc.nextInt();
		if(in < 0 || in > 6)
			System.out.println("잘못 입력 하셨습니다.");
		else
			System.out.println(Day[in]);
	}
	
	public void method6() {
		int in, in2, sum = 0;
		
		System.out.println("배열의 길이: ");
		in = sc.nextInt();
		int Arr[] = new int[in];
		for(int i = 0; i < in; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: \n", i);
			in2 = sc.nextInt();
			Arr[i] = in2;
			sum += in2;
		}
		
		for(int a = 0; a < in; a++)
			System.out.print(Arr[a] + " ");
		System.out.println("\n총합: " + sum);
	}
	
	public void method7() {
		int Arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 10) + 1;
			Arr[i] = rand;
			System.out.print(Arr[i] + " ");
		}
	}
	
	public void method8() {
		int Arr[] = new int[10];
		int max, min;
		
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 10) + 1;
			Arr[i] = rand;
			System.out.print(Arr[i] + " ");
		}
		max = Arr[0];
		min = Arr[0];
		for(int a : Arr) {
			if(a > max)
				max = a;
			else if(a < min)
				min = a;
		}
		System.out.println("\n최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public void method9() {
		int Arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 10) + 1;
			Arr[i] = rand;
			for(int a = 0; a < i; a++) {
				if(Arr[a] == Arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int n : Arr)
			System.out.print(n + " ");
	}
	
	public int[] method10() {
		int lotto[] = new int[6];
		int ran;
		
		for(int i = 0; i < lotto.length; i++) {
			ran = (int)(Math.random() * 45) + 1;
			lotto[i] = ran;
			for(int a = 0; a < i; a++) {
				if(lotto[a] == ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		
		return lotto;
	}
}
		
		
