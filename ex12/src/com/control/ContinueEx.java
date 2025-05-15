package com.control;

public class ContinueEx {
	
	public static void main(String[] args) {
	// 1. 1부터 100까지 출력
	// 2. 1부터 100까지의 합을 구하고 출력
	// 3. 짝수의 합만 구해서 출력
	int sum = 0, sum2 = 0;
	for (int i = 1; i <= 100; i++) {
		System.out.println(i);
		sum += i;
		if(i % 2 == 1)
			continue;
		sum2 += i;
	}
	System.out.println("1부터 100까지의 합: " + sum);
	System.out.println("짝수의 합: " + sum2);
	}
}
