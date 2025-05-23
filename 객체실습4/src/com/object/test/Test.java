package com.object.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 
		String grade = "B";
		int score1 = 0;
		
		switch(grade) {
		case "A", "a" -> score1 = 100;
		case "B" -> {
			int res = 100 - 20;
			score1 = res;
			}
		default -> score1 = 60;
		}
		System.out.println("score1 : " + score1);
		
		System.out.println("==================");
		// 3번
		// 3의 배수를 출력
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
				System.out.println(i);
				// sum = sum + i
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		
		System.out.println("===================== 4번");
		// 주사위 : 1-6
		int num1, num2;
		// 두 수의 합이 5가 될때까지 반복
		while(true) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			
			System.out.printf("(%d, %d)\n", num1, num2);
			if(num1+num2 == 5) {
				System.out.println("두 수의 합이 5입니다.");
				System.out.println("반복문 탈출");
				break;
			}
		}
		
		System.out.println("===================== 6번");
		for(int i=1;i<=5;i++) {
			
			//System.out.println(i);
			// i가 1일때 j는 1
			// i가 2일때 j는 1,2
			// i가 3일때 j는 1,2,3
			// i가 4일때 j는 1,2,3,4
			// 숫자 대신 * 을 출력
			for(int j=5;j>=1;j--) {
				
				//System.out.print(j);
				System.out.print("*");
				
			}
			// j의 반복이 끝나면 줄바꿈을 해준다
			System.out.println(); 
		}
		
		System.out.println("===================== 6번");
		int[][] array = {
				{1,2},
				{3,4,5},
				{7,8,9,10,11}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		System.out.println("===================== 7번");
		int[] array1 = {1,5,3,8,2};
		int max = array1[0];
		for(int i : array1) {
			if(i > max)
				max = i;
		}
		System.out.println(max);
		
		System.out.println("===================== 8번");
		int[][] array2 = {
				{1,2},
				{3,4,5},
				{7,8,9,10,11}
		};
		int sum1 = 0, length = 0, sum_0;
		double ave;
		
		for(int i = 0; i < array2.length; i++) {
			sum_0 = 0;
			for(int j = 0; j < array2[i].length; j++) {
				sum1 += array2[i][j];
				length++;
				sum_0 += array2[i][j];
			}
			System.out.printf("array2[%d]방의 요소들의 합계: %d\n", i, sum_0);
		}
		ave = sum1 / length;
		System.out.println("합계: " + sum1 + " 평균: " + ave);
		
		System.out.println("===================== 9번");
		
		int stu_num, max_score = 0, sum_score = 0, i = 0, menu;
		System.out.println("학생 수를 입력해주세요: ");
		stu_num = sc.nextInt();
		int score[] = new int[stu_num];
		double ave_score = 0;
		
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("\n학생수 > " + stu_num);
			} 
			else if(menu == 2) {
				while(i < stu_num) {
					System.out.printf("score[%d]: ", i);
					score[i] = sc.nextInt();
					sum_score += score[i];
					if(max_score < score[i])
						max_score = score[i];
					i++;
				}
				ave_score = (double)sum_score / stu_num;
			}
			else if(menu == 3) {
				for(int j = 0; j < stu_num; j++) {
					System.out.printf("\nscore[%d]: %d\n", j, score[j]);
				}
			}
			else if(menu == 4) {
				System.out.println("최고 점수: " + max_score);
				System.out.println("평균 점수: " + ave_score);
			}
			else if(menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 메뉴 번호를 입력해주세요.");
			}
		}
		
		
	}
	static Scanner sc = new Scanner(System.in);
}
