package com.ss.scan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanEx {

	/**
	 * Scanner 사용을 위한 예제 ->
	 * 데이터를 직접 키보드로 입력하지 않고, 프로그램 내부에서 자동으로 처리되도록 구성가능
	 * 사용자로부터 이름, 키, 몸무게를 입력받은 후
	 * BMI를 계산해서 결과를 화면에 출력합니다.
	 */
	// throws IOException :
	// Java에서 입출력(I/O) 중에 발생할 수 있는 예외 상황을 처리하기 위한 예외 클래스
	public void input() throws IOException {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Double> heights = new ArrayList<>();
		ArrayList<Integer> weights = new ArrayList<>();
		ArrayList<Double> BMIs = new ArrayList<>();
		ArrayList<String> types = new ArrayList<>();
		double ave_bmi = 0, total_bmi = 0;
		int underweight = 0, normalweight = 0, 
		overweight = 0, obesity = 0, highobesity = 0;
		String type;
		
		// 입력부분
		while (true) {
			// exit을 입력하면 종료
			System.out.println("이름(종료하려면 exit) : ");
			String name = scan.next();
			
			if( name.equals("exit") ) {
				System.out.println("종료합니다.");
				break;	
			}
			
			double height = 0;
			int weight = 0;
			
			// 키와 몸무게에 숫자 이외의 문자를 입력하면 오류메세지를 출력하고
			// 다시 입력하도록 유도
			try {
				System.out.println("키(m): ");
				height = scan.nextDouble();
				
				System.out.println("몸무게: ");
				weight = scan.nextInt();
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("Error: " + e.getMessage() + 
						 "\n잘못 입력하셨습니다. 숫자만 입력해주세요.");
				scan.nextLine();
				continue;
			}
			
			// bmi 계산, 판별 부분
			double bmi = weight / (height * height);
			
			System.out.printf("%s님의 BMI 수치는 %.2f이며 ", name, bmi);
			
			if ( bmi < 18.5 ) {
				System.out.println("저체중입니다.");
				underweight++;
				type = "저체중";
			}
			else if ( 18.5 <= bmi && bmi < 23 ) {
				System.out.println("정상 체중입니다.");
				normalweight++;
				type = "정상체중";
			}
			else if ( 23 <= bmi && bmi < 25 ) {
				System.out.println("과체중입니다.");
				overweight++;
				type = "과체중";
			}
			else if ( 25 <= bmi && bmi < 30 ) {
				System.out.println("비만 1단계입니다.");
				obesity++;
				type = "비만";
			}
			else if ( 30 <= bmi && bmi < 35 ) {
				System.out.println("비만 2단계입니다.");
				obesity++;
				type = "비만";
			}
			else {
				System.out.println("고도비만입니다.");
				highobesity++;
				type = "고도비만";
			}
			// 리스트에 추가
			names.add(name);
			heights.add(height);
			weights.add(weight);
			BMIs.add(bmi);
			types.add(type);
		}
		
		// 파일 생성 부분
		// FileWriter를 생성 (파일명 지정)
		try(FileWriter fw = new FileWriter("bmi_list.txt")){
			// 제목 헤더 작성
			fw.write("이름\t키(m)\t몸무게(kg)\tBMI\t상태\n");
			
			// 저장된 리스트를 한 줄씩 파일에 작성
			for(int i = 0; i < names.size(); i++) {
				String line = String.format("%s\t%.2f\t%d\t%.2f\t%s\n"
				, names.get(i), heights.get(i), weights.get(i),
				BMIs.get(i), types.get(i));
				fw.write(line);
			}
			fw.write("\n[BMI 분포 통계]\n");
			fw.write("저체중: " + underweight + "명\n");
			fw.write("정상 체중: " + normalweight + "명\n");
			fw.write("과체중: " + overweight + "명\n");
			fw.write("비만: " + obesity + "명\n");
			fw.write("고도비만: " + highobesity + "명\n");
			System.out.println("저장되었습니다.");
		} catch(IOException e) { // 오류 발생 시 메세지 출력
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
			e.printStackTrace();
		}
		
		// 결과 출력 부분
		// 리스트 출력
		System.out.println("=================");
		System.out.printf("이름\t키(m)\t몸무게(kg)\tBMI\t상태\n");
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%s\t%.2f\t%d\t%.2f\t%s\n", 
					names.get(i), heights.get(i), weights.get(i), 
					BMIs.get(i), types.get(i) );
			total_bmi += BMIs.get(i);
		}
		
		// 평균과 결과값 출력
		ave_bmi = total_bmi / names.size();
		System.out.printf("BMI 평균은 %.2f입니다.\n", ave_bmi);
		System.out.printf("저체중: %d명, 정상체중: %d명, 과체중: %d명,"
				+ " 비만: %d명, 고도비만: %d명입니다.", underweight,
				normalweight, overweight, obesity,
				highobesity);
		scan.close();
		
	}
	
}
