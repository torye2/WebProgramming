package com.object.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
	
	/*
	 * HashSet
	 * 	Set 인터페이스의 구현체
	 * 	Set<타입> 변수명 = new HashSet<>();
	 * 	중복된 데이터가 들어와도 같은 값은 한번만 저장한다
	 */
	public void hashsetLotto() {
		// 중복을 허용하지 않음
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() <= 6) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
		}
		System.out.println(lotto);
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
	
	public String Substring(String str, int index1, int index2) {
		String s[] = str.split(str);
		for(String n : s)
			System.out.println(n);
		
		return str;
	}
	
}
