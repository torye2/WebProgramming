package com.object;

import com.object.practice.NonStaticSample;

public class App {

	public static void main(String[] args) {
		// NonStaticSample 클래스의 4가지 메서드를 각각 호출
		NonStaticSample nss = new NonStaticSample();
		
		nss.printLottoNumbers();
		System.out.println();
		nss.outputChar(5, 'a');
		System.out.println();
		System.out.println(nss.mySubstring("apple", 2, 4));

	}

}
