package com.lib.util;

import java.util.Scanner;

public class ScannerUtil {
	static Scanner s = new Scanner(System.in);
	// 정적 멤버는 정적 필드만 반환 가능
	//사용자의 입력을 받아서 문자열을 반환
	public static String getString(String msg) {
		System.out.print(msg);
		String str = s.next();
		return str;
	}
	
	public int getInt(String msg) {
		System.out.print(msg);
		int num = s.nextInt();
		return num;
	}
} 