package com.ss.expensetracker.dto;

import com.ss.expensetracker.model.Category;
import java.time.LocalDate;

/**
 * 새 지출 생성 요청용 DTO
 */
public class ExpenseCreateDto {
	// 필드 선언
	private final Category category;
	private final String memo;
	private final double amount;
	private final LocalDate date;
	private final Long id;
	
	// 생성자
	public ExpenseCreateDto(Category category, String memo, double amount, LocalDate date, Long id) {
		this.category = category;
		this.memo = memo;
		this.amount = amount;
		this.date = date;
		this.id = id;
	}
	
	// ----- getter -----
	public Category getCategory() {
		return category;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public Long getId() {
		return id;
	}
}
