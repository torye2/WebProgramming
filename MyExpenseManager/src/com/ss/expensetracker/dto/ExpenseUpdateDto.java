package com.ss.expensetracker.dto;

import com.ss.expensetracker.model.Category;
import java.time.LocalDate;

/**
 * 기존 지출 수정 요청용 DTO
 */
public class ExpenseUpdateDto {
	// 필드 선언
	private final String id;
	private final Category category;
	private final double amount;
	private final LocalDate date;
	private final String memo;
	// 생성자
	public ExpenseUpdateDto(String id, Category category, double amount, LocalDate date, String memo) {
		this.id = id;
		this.category = category;
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	// ----- getter ------
	public String getId() {
		return id;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getMemo() {
		return memo;
	}
}
