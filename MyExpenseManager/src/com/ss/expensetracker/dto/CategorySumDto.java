package com.ss.expensetracker.dto;

import java.util.Locale.Category;

/**
 * 카테고리별 요약 정보를 담는 DTO
 */
public class CategorySumDto {
	private Category category;
	private double amount;
	
	public CategorySumDto(Category category, double amount) {
		this.category = category;
		this.amount = amount;
	}
	
	public Category getCategory() {return category;}
	public double getAmount() {return amount;}
}
