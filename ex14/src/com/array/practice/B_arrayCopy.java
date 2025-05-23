package com.array.practice;

import java.util.Arrays;

public class B_arrayCopy {
	/*
	 * 배열의 복사
	 * 	- 얕은 복사 : 배열의 주소만 복사
	 * 	- 깊은 복사 : 동일한 새로운 배열을 생성
	 */
	public void method1() {
		// 얕은 복사
		int origin[] = {1,2,3,4,5};
		int copy[] = origin;
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		copy[3] = 44;
		System.out.println("copy[3] = 44 변경");
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
	
	/*
	 * 반복문을 활용한 깊은 복사
	 */
	public void method2() {
		int origin[] = {1,2,3,4,5};
		int copy[] = new int[5];
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		
		copy[3] = 44;
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
	}
	
	/*
	 * 2. System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사
	 */
	public void method3() {
		int origin[] = {1,2,3,4,5};
		int copy[] = new int[10];
		// System.arraycopy(원본 배열이름, 복사 시작 인덱스, 복사본 배열명, 
		// 복사본 배열에서의 복사 시작 위치, 복사할 길이)
		System.arraycopy(origin, 0, copy, 3, origin.length);
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
	
	/*
	 * 3. Array 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사
	 */
	public void method4() {
		int origin[] = {1,2,3,4,5};
		int copy[] = Arrays.copyOf(origin, 4);
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
	
	/*
	 * 4. clone() 메소드를 이용한 깊은 복사
	 */
	public void method5() {
		int origin[] = {1,2,3,4,5};
		int copy[] = origin.clone();
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
}
