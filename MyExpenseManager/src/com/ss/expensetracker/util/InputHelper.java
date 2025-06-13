package com.ss.expensetracker.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputHelper {
	private final Scanner sc = new Scanner(System.in);
	// 날짜 파싱용 포맷터 (yyyy-MM-dd 형태의 문자열을 LocalDate로 변환)
	private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	/** 프롬프트 메시지를 출력하고 정수가 입력될 때까지 재시도 */
	public int readInt(String prompt) {
		while(true) { // 올바른 값을 입력할 때까지 반복
			System.out.print(prompt + ": "); // UI 제공
			try {
				// 한 줄 입력을 읽어 공백 제거 후 입력받은 문자열을 정수로 변환
				return Integer.parseInt(sc.nextLine().trim()); 
			} catch(NumberFormatException e) { // 숫자가 아닐 경우 예외처리
				System.out.println("유효한 정수를 입력해주세요.");
			}
		}
	}
	
	/** 프롬프트 메시지를 출력하고 실수가 입력될 때까지 재시도 */
	public double readDouble(String prompt) {
		while(true) { // 올바른 값을 입력할 때까지 반복
			System.out.print(prompt + ": "); // UI 제공
			try {
				// 한 줄 입력을 읽어 공백 제거 후 입력받은 문자열을 실수로 변환
				return Double.parseDouble(sc.nextLine().trim()); 
			} catch(NumberFormatException e) { // 숫자가 아닐 경우 예외처리
				System.out.println("유효한 실수를 입력해주세요.");
			}
		}
	}
	
	/** 프롬프트 메시지를 출력하고 빈 칸이 아닌 문자열을 입력받음 */
	public String readLine(String prompt) {
		System.out.print(prompt + ": ");
		String line = sc.nextLine().trim();
		// 만약 빈 문자열이라면 재귀 호출로 루프시키고 유효한 문자열이면 그대로 반환
		return line.isEmpty() ? readLine(prompt) : line;
	}
	
	/** 프롬프트 메시지를 출력하고 yyyy-MM-dd 형식의 날짜를 입력받아 LocalDate로 반환 */
	public LocalDate readDate(String prompt) {
		while(true) {
			System.out.println(prompt + "(yyyy-MM-dd): ");
			try {
				// dateFormat = 다른 포맷(예: dd/MM/yyyy 등)을 지원하거나 입력 형식을 명확히
				return LocalDate.parse(sc.nextLine().trim(), dateFormat);
				// DateTimeException은 범위가 너무 넓어서 실제로 어디서 예외가 났는지 구분하기 위해
			} catch(DateTimeParseException e) {
				System.out.println("날짜 형식이 올바르지 않습니다. (yyyy-MM-dd)");
			}
		}
	}
}
