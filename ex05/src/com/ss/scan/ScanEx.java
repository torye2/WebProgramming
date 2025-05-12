package com.ss.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanEx {

	/**
	 * 사용자로부터 이름, 키, 몸무게를 입력받아서 화면에 출력합니다.
	 */
	public void input() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Double> heights = new ArrayList<>();
		ArrayList<Integer> weights = new ArrayList<>();
		ArrayList<Double> BMIs = new ArrayList<>();		
		
		while (true) {
			
			System.out.println("이름(종료하려면 exit) : ");
			String name = scan.next();
			
			if( name.equals("exit") ) {
				System.out.println("종료합니다.");
				break;	
			}
			
			System.out.println("키(m): ");
			double height = scan.nextDouble();
			
			System.out.println("몸무게: ");
			int weight = scan.nextInt();
			
			double BMI = weight / (height*height);
			
			System.out.printf("%s님의 BMI 수치는 %.2f이며", name, BMI);
			
			if ( BMI < 18.5 ) {
				System.out.println("저체중입니다.");
			}
			else if ( 18.5 < BMI & BMI < 24.9 ) {
				System.out.println("정상 체중입니다.");
			}
			else if ( 25.0 < BMI & BMI < 29.9 ) {
				System.out.println("과체중이므로 체중관리가 필요합니다.");
			}
			else if ( 30.0 < BMI ) {
				System.out.println("비만이므로 체중관리가 필요합니다.");
			}
			
			names.add(name);
			heights.add(height);
			weights.add(weight);
			BMIs.add(BMI);
		}
		
		System.out.println("=================");
		System.out.println("이름   키  몸무게  BMI");
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%s %.2f %d %.2f\n", 
					names.get(i), heights.get(i), weights.get(i), BMIs.get(i) );
		}
		scan.close();
	}
	
}
