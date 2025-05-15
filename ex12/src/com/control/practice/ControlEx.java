package com.control.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlEx {
	int input;
	String res;
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요: ");
		try {
			input = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatch! 메뉴 번호만 입력해주세요");
			sc.nextLine();
			return;
		}
		res = input == 1 ? "입력메뉴입니다." : 
			  input == 2 ? "수정메뉴입니다." :
		 	  input == 3 ? "조회메뉴입니다." :
		 	  input == 4 ? "삭제메뉴입니다." : 
		      input == 9 ? "프로그램이 종료됩니다." : "잘못입력하셨습니다.";  
		System.out.println(res);
	}
	
	public void method2() {
		System.out.println("숫자를 입력해주세요: ");
		try {
			input = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("InputMismatch! 숫자만 입력해주세요");
			sc.nextLine();
			return;
		}
		res = input > 0 && input % 2 == 0 ? "짝수"
			: input <= 0 ? "양수만 입력해주세요"
			: "홀수";
		System.out.println(res);
	}
	
	public void method3() {
		int math, eng, lan, total;
		double ave;
		
		System.out.println("국어 점수: ");
		lan = sc.nextInt();
		System.out.println("수학 점수: ");
		math = sc.nextInt();
		System.out.println("영어 점수: ");
		eng = sc.nextInt();
		
		total = lan + math + eng;
		ave = total / 3;
		
		if( math >= 40 && eng >= 40 && lan >= 40 && ave >= 60.0 ) 
			System.out.printf("국어: %d점\t영어: %d점\t수학: %d점\t합계: %d점\t평균: %.1f점\n축하합니다, 합격입니다!\n"
					, lan, eng, math, total, ave);
		else
			System.out.printf("국어: %d점\t영어: %d점\t수학: %d점\t합계: %d점\t평균: %.1f점\n불합격입니다.\n"
					, lan, eng, math, total, ave);
		
	}
	
	public void method4() {
		int math, eng, lan, total, key;
		double ave;
		
		System.out.println("국어 점수: ");
		lan = sc.nextInt();
		System.out.println("수학 점수: ");
		math = sc.nextInt();
		System.out.println("영어 점수: ");
		eng = sc.nextInt();
		
		total = lan + math + eng;
		ave = total / 3;
		
		if (math >= 40 && eng >= 40 && lan >= 40 && ave >= 60.0)
			key = 1;
		else
			key = 2;
		
		switch(key) {
		case 1: 
			System.out.printf("국어: %d점\t영어: %d점\t수학: %d점\t합계: %d점\t평균: %.1f점\n"
				+ "축하합니다, 합격입니다!\n", lan, eng, math, total, ave); 
			break;
		case 2: 
			System.out.printf("국어: %d점\t영어: %d점\t수학: %d점\t합계: %d점\t평균: %.1f점\n"
				+ "불합격입니다.\n", lan, eng, math, total, ave); 
			break;
		}
	}
	
	public void method5() {
		String id = "momo", pw = "1234", idinput, pwinput;
		
		while(true) {
		System.out.println("아이디: ");
		idinput = sc.next();
		System.out.println("비밀번호: ");
		pwinput = sc.next();
		
		res = idinput.equals(id) && pwinput.equals(pw) ? "로그인 성공"
			: idinput.equals(id) ? "비밀번호가 틀렸습니다."
			: pwinput.equals(pw) ? "아이디가 틀렸습니다." : "아이디와 비밀번호 모두 틀렸습니다.";
		System.out.println(res);
		}
	}
	
	public void method6() {
		String inp;
		
		System.out.println("직급을 입력해주세요");
		inp = sc.next();
		res = inp.equals("관리자") ? "관리자 : 회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성"
			: inp.equals("회원") ? "회원 : 게시글작성, 게시글조회, 댓글작성"
			: inp.equals("비회원") ? "비회원 : 게시글 조회" : "잘못입력했습니다.";
		System.out.println(res);
	}
	
	public void method7() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키(m) : ");
		double height = scanner.nextDouble();
		
		System.out.println("몸무게(kg) : ");
		int weight = scanner.nextInt();
		
		double bmi = weight / (height * height);
		
		if ( bmi < 18.5 )
			System.out.println("저체중입니다.");
		else if ( 18.5 <= bmi && bmi < 23 )
			System.out.println("정상 체중입니다.");
		else if ( 23 <= bmi && bmi < 25 )
			System.out.println("과체중입니다.");
		else if ( 25 <= bmi && bmi < 30 )
			System.out.println("비만 1단계입니다.");
		else if ( 30 <= bmi && bmi < 35 )
			System.out.println("비만 2단계입니다.");
		else
			System.out.println("고도비만입니다.");
		
		scanner.close();
	}
	
	public void method8() {
		System.out.println("실행할 기능을 선택하세요.");
		input = sc.nextInt();
		
		switch(input) {
		case 1: 
			method1(); 
			break;
		case 2: 
			method2(); 
			break;
		case 3: 
			method3(); 
			break;
		case 4: 
			method4(); 
			break;
		case 5: 
			method5(); 
			break;
		case 6: 
			method6(); 
			break;
		case 7: 
			method7(); 
			break;
		default: 
			System.out.println("잘못입력하셨습니다."); 
			break;
		}
	}
	
}
