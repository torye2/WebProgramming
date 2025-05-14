package com.ss.expensetracker.model;

import java.time.LocalDate;

public class Expense {
	private String category; // 지출 카테고리
	private String memo; // 지출 내용
	private double amount; // 지출 금액
	private LocalDate date; // 지출 날짜
	
	public Expense(String category, String memo, double amount, LocalDate date) {
		this.category = category;
		this.memo = memo;
		this.amount = amount;
		this.date = date;
	}
}
