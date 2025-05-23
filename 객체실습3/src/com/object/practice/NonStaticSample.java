package com.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개를 중복 없이 출력
		int lotto[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.print("랜덤 값: ");
		for(int i : lotto)
			System.out.print(i + " ");
		
	}
	
	public void outputChar(int num, char c) {
		// 전달 받은 문자를 전달 받은 숫자 만큼 출력
		System.out.print(c + "문자 " + num + "개 출력:");
		
		for(int i = 0; i < num; i++)
			System.out.print(" " + c);
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 문자열과 시작 인덱스, 끝 인덱스를 전달 받아 해당 인덱스 범위의 문자열을 리턴
		String res;
		
		res = str.substring(index1, index2);
		
		return res;
	}
	
}
