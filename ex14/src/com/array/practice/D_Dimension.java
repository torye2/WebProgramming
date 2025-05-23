package com.array.practice;

public class D_Dimension {
	/*
	 * 1) 이차원 배열 선언
	 * 	자료형[][] 배열명;
	 * 	자료형 배열명[][];
	 * 	자료형[] 배열명[];
	 * 
	 * 2) 이차원 배열의 할당
	 * 	배열명 = new 자료형[행크기][열크기];
	 * 
	 * 3) 이차원 배열의 선언과 동시에 할당
	 * 	자료형[][] 배열명 = new 자료형[행크기][열크기];
	 * 
	 * 4) 이차원 배열의 초기화
	 * 	- 인덱스로 접근해서 초기화
	 * 	  배열명[0][0] = 값;
	 * 	- 선언과 동시에 초기화
	 * 	  자료형[][] 배열명 = {
	 * 					{1,2,3}
	 * 					, {1,2}
	 * 					, {1,2,3,4,5}
	 * 				}
	 */
	public void method1() {
		
	}
	
	/*
	 * 	 ■	  ■
	 * ■ ■	■ □ □
	 * ■ ■	■ ■ ■
	 * ■ ■	■ □ ■
	 * 
	 * 자리 없음 = 9
	 * 빈자리 = 0 □
	 * 사용중인 자리 = 1 ■
	 */
	public void method2() {
		int[][] array = {
				{1,1,1,1,1}
				,{1,1,1,1,1}
				,{1,1,1,1,1}
				,{1,1,1,1,1}
		};
		
		for(int i = 0; i < array.length; i++) {
			array[i][(int)(Math.random() * 5)] = 0;
			array[i][(int)(Math.random() * 5)] = 9;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
			/*	if(j == 2) {
					array[i][j] = 9;
				} */
				if(array[i][j] == 1)
					System.out.print("■" + " ");
				else if(array[i][j] == 0)
					System.out.print("□" + " ");
				else if(array[i][j] == 9)
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		
	}
}
