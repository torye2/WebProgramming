package com.chap1.method;

public class Student {
	private String name;
	private int id;
	private int age;
	private String address;
	private String gender;
	
	public Student() {
		
	}
	
	// 생성자 - 생성자를 만들면 더 이상 기본 생성자를 제공해주지 않는다
	// 기본생성자가 필요하다면 추가로 만들어줘야 한다
	public Student(String name, int id, int age, String address, String gender) {
		//super(); // 나의 부모의 기본 생성자를 호출
		
		// 지역변수와 전역변수의 변수명 같은 때 전역변수에 접근 하기 위해서 this 키워드를 사용한다
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	
	/*
	 * 부모가 가진 메서드를 재정의
	 */
	@Override
	public String toString() {
		String msg = "이름 : " + name + "\n학번 : " + id + "\n나이 : " + age
					+ "\n주소 : " + address + "\n성별 : " + gender;
		return msg;
	}
	
	/* 
	 * 필드에 접근해서 값을 반환하는 메서드
	 * 필드의 접근제한자가 private인 경우, 직접 접근을 막고 메서드를 이용한 접근을 제공
	 * getter 
	 * 	- 접근제한자가 public이다
	 * 	- 하나의 필드값을 반환한다
	 * 	- 메서드명은 getXXX()이다
	 * 	- 매개변수가 없다
	 * 	- 반환타입을 명시해야한다
	 */
	public String getName() {
		return name;
	}
	/*
	 * 필드에 접근해서 값을 세팅해주는 메서드
	 * 
	 * setter
	 * 	- 접근제한자가 public이다
	 * 	- 하나의 필드값을 수정하는 역할
	 * 	- 매개변수가 있다
	 * 	- 메서드명 setXXX()이다
	 * 	- 값을 수정하기 위해서는 수정하려는 필드의 타입과 동일한 타입의 매개변수를 받아와야한다
	 * 	- 반환타입이 없다
	 */
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
