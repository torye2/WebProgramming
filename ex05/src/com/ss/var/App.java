package com.ss.var;

import com.ss.var.practice.*;

public class App {

	public static void main(String[] args) {
		Calc a = new Calc();
		int r = a.plus(10,2);
		System.out.println(r);
		a.toStr("10, 2");
		
		int r2 = a.minus(2,1);
		System.out.println(r2);
		a.toStr("2, 1");
		
	}

}
