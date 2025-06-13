package com.chap3;

import com.chap3.field.Singleton;
import com.chap3.field.StaticField;

public class App {

	public static void main(String[] args) {
		/*
		// 객체를 생성하지 않고 클래스 이름으로 접근이 가능하다
		System.out.println(StaticField.pubSta);
		// 접근제한자의 영향을 받는다
		// private 선언 시 패키지가 다른경우 접근이 불가능하다
		StaticField.setPubSta("setPubSta");
		System.out.println(StaticField.pubSta);
		
		StaticField sf = new StaticField();
		StaticField sf1 = new StaticField();
		sf.pub = "pub";
		sf1.pub = "pub1";
		StaticField.setPriSta("hi");
		
		System.out.println(Math.PI);
		System.out.println(StaticField.pubSta);
		System.out.println(StaticField.getPriSta());
		System.out.println("=================");
		
		System.out.println(sf.pubSta);
		System.out.println(sf.pub);
		System.out.println("=================");
		sf1.pubSta = "aa";
		System.out.println(sf1.pubSta);
		System.out.println(sf1.getPriSta());
		System.out.println(sf1.pub);
		System.out.println("=================");
		sf.setPubSta("변경");
		System.out.println(sf1.pubSta);
		System.out.println(sf.getPriSta());
		System.out.println(sf.pub);
		*/
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		if(s == s1)
			System.out.println("같은 객체입니다.");
		else
			System.out.println("다른 객체입니다.");
	}

}
