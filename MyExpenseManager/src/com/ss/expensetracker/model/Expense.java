package com.ss.expensetracker.model;

import java.time.LocalDate;

/**
 * 지출 항목을 나타내는 모델 클래스
 */
public class Expense {
	private Category category; // 지출 카테고리
	private String memo; // 지출 내용
	private double amount; // 지출 금액
	private LocalDate date; // 지출 날짜
	
	/**
	 * 기본 생성자
	 */
	public Expense() {
		
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 */
	public Expense(Category category, String memo, double amount, LocalDate date) {
		this.category = category;
		this.memo = memo;
		this.amount = amount;
		this.date = date;
	}
	
	// --- getters & setters ---
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		
	}
}
