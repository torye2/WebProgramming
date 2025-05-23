package com.object.practice;

public class StaticSample {
	private static String value;
	
	public static void toUpper() {
		// value 값을 모두 대문자로 변경
		StaticSample.value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		// value의 전달받은 인덱스 위치의 값을 전달받은 문자로 변경
		char val[] = value.toCharArray();
		val[index] = c;
		value = new String(val);
	}
	
	public static int valueLength() {
		// value의 글자 갯수 리턴
		int res = value.length();
		
		return res;
	}
	
	public static String valueConcat(String str) {
		// value 값과 전달받은 문자열을 하나로 합쳐서 반환
		String res = value + str;
		
		return res;
	}

	// ===== getter & setter ======
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
}
