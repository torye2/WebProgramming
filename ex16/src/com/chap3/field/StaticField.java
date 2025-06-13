package com.chap3.field;

public class StaticField {
	
	// 정적멤버 - 정적 필드, 정적 메서드
	// static 키워드는 객체로 생성하지 않아도 클래스명을 통해서 접근 할 수 있다.
	// 객체에 소속된 멤버가 아니라 클래스에 소속된 멤버이다
	// static 메모리 영역에 할당 된다
	
	// 정적 필드
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// 인스턴스 필드
	public String pub = "public";
	
	// static 필드에 대한 getter/setter 메서드 또한 static 키워드를 붙여서 만들어야 한다
	public static String getPriSta() {
		return priSta;
	}
	
	// 인스턴스 멤버는 new 연산자를 만나서 메모리에 올라간 이후 사용 가능하다
	public static void setPriSta(String priSta) {
		
		// 정적 메서드에서 인스턴스 필드에 접근하기 위해서는 생성 후 접근해야한다
		// 같은 클래스 안에 있더라도 바로 접근이 불가능하다
		// pub = pubSta;
		// 객체를 생성하지 않아서 this는 존재하지 않는다
		StaticField.priSta = priSta;
	}
	
	
	public static String getPubSta() {
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		StaticField.pubSta = pubSta;
	}

	public static void main(String[] args) {
		StaticField sf = new StaticField();
		StaticField sf1 = new StaticField();
		sf.pub = "pub";
		sf1.pub = "pub1";
		
		System.out.println(Math.PI);
		System.out.println(StaticField.pubSta);
		System.out.println(StaticField.priSta);
		System.out.println("=================");
		
		System.out.println(sf.pubSta);
		System.out.println(sf.pub);
		System.out.println("=================");
		System.out.println(sf1.pubSta);
		System.out.println(sf1.pub);
		System.out.println("=================");
		sf.setPubSta("변경");
		sf1.pubSta = "aa";
		System.out.println(sf1.pubSta);
		System.out.println(sf.pubSta);
	}
}
