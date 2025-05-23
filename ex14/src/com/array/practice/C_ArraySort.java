package com.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {
	
	public void method1() {
		int arr[] = {3,2,5,1,7};
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		System.out.println();
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println("\n최소값: " + arr[0]);
		System.out.println("최대값: " + arr[arr.length-1]);
		
		// 내림차순 정렬
		Integer IntegerArr[] = {3,2,5,1,7};
		Arrays.sort(IntegerArr, Collections.reverseOrder());
		
		System.out.println();
		for(int num : IntegerArr) {
			System.out.print(num + " ");
		}
	}
}
