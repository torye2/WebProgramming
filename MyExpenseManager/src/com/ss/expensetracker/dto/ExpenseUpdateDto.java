package com.ss.expensetracker.dto;

import com.ss.expensetracker.model.Category;
import java.time.LocalDate;

/**
 * 기존 지출 수정 요청용 DTO
 */
public class ExpenseUpdateDto {
	// 필드 선언
	private final Long id;
	private final Category category;
	private final Double amount;
	private final LocalDate date;
	private final String memo;
	// 생성자
	public ExpenseUpdateDto(Long id, Category category, Double amount, LocalDate date, String memo) {
		this.id = id;
		this.category = category;
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	// ----- getter ------
	public Long getId() {
		return id;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getMemo() {
		return memo;
	}
}
