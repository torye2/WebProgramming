package com.ss.expensetracker.model;

import java.time.LocalDate;

/** 지출 항목을 나타내는 모델 클래스 */
public class Expense {
	private Category category; // 지출 카테고리
	private String memo; // 지출 내용
	private Double amount; // 지출 금액
	private LocalDate date; // 지출 날짜
	private Long id; // ID
	
	/** 기본 생성자 */
	public Expense() {
		
	}
	
	/** 모든 필드를 초기화하는 생성자 */
	public Expense(Category category, String memo, Double amount, LocalDate date, Long id) {
		this.category = category;
		this.memo = memo;
		this.amount = amount;
		this.date = date;
		this.id = id;
	}
	
	// --- getters & setters ---
	
	/** 현재 Expense 인스턴스에 설정된 카테고리 값을 반환 */
	public Category getCategory() {
		return category;
	}
	
	/** 인자로 받은 Category 값을 이 객체의 category 필드에 할당 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	/** 현재 Expense의 memo 문자열을 반환 */
	public String getMemo() {
		return memo;
	}
	
	/** 인자로 받은 memo를 memo 필드에 저장 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	/** 이 지출 항목의 금액 값을 double로 반환 */
	public Double getAmount() {
		return amount;
	}
	
	/** 인자로 받은 amount를 amount 필드에 할당 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	/** 이 지출의 날짜 값을 LocalDate 타입으로 반환 */
	public LocalDate getDate() {
		return date;
	}
	
	/** 인자로 받은 date를 date 필드에 저장 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	/** 인자로 받은 id를 id 필드에 저장 */
	public Long getId(Long id) {
		return id;
	}
	
	@Override
	public String toString() {
		return "Expense{ category = " + category +
				", memo = " + memo + ", amount = " + amount +
				", date = " + date + ", id = " + id +'}';
	}
	
}