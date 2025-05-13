package com.ss.scan.practice;

import java.util.Scanner;

public class Scan {
	
	// 반환타입이 없다
	// 클래스명과 동일한 이름
	// 기본생성자 : 반환타입과 매개변수가 없는
	public Scan() {
		
		
		
	}

	public void bmi_m() {
		// 웹어플리케이션서버(WAS) : 동적 서비스
		// 웹서버로부터 수집된 정보를 받아 옵니다.
		Scanner scanner = new Scanner(System.in);
		
		// 키
		System.out.println("키(m) : ");
		double height = scanner.nextDouble();
		
		// 몸무게
		System.out.println("몸무게(kg) : ");
		int weight = scanner.nextInt();
		
		// Bmi를 구한 후 변수에 값을 저장
		// 변수명은 bmi로 한다
		double bmi = weight / (height * height);
		System.out.printf("당신의 키는 %.2fm, 몸무게는 %dkg이고, ", height, weight);
		System.out.printf("당신의 bmi는 %.2f입니다.", bmi);
		
		// 사용자의 bmi지수에 따라 안내문을 출력
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
	
	/**
	 * 사용자의 키 입력을 cm단위로 입력 받습니다.
	 */
	public void bmi() {
		// 웹어플리케이션서버(WAS) : 동적 서비스
		// 웹서버로부터 수집된 정보를 받아 옵니다.
		Scanner scanner = new Scanner(System.in);
		
		// 변수이름에 점을 찍으면 사용 가능한 메서드와 필드 정보를 알 수 있다
		// 사용자의 입력을 대기
		// String str = scanner.next();
		System.out.println("키(cm) : ");
		int height = scanner.nextInt();
		System.out.println("키는 " + height + "cm입니다.");
		System.out.println("몸무게(kg) : ");
		int weight = scanner.nextInt();
		System.out.println("몸무게는 " + weight + "kg입니다.");
		
		scanner.close();
	}

}
