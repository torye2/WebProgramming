package com.object.practice;

public class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(){		
	}
	
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// 오버로딩이 아님 -> 타입과 갯수가 같다
	/*
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	*/
	public Member(String name, String id, String password, int age) {
		//super(); -> 부모의 필드, 메서드에 접근할 때 super 키워드 사용
		//this.name = name;
		//this.id = id;
		// 생성자를 호출하여 필드의 값을 초기화
		// 첫번째 줄에 와야함
		this(name, id);
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String info() {
		return name + ", " + id + ", " + age;
	}
}
