package com.ss.expensetracker.dto;

import java.util.Locale.Category;
import java.util.Map;

/**
 * 월간 리포트 결과를 담는 DTO
 */
public class ReportDto {
	private int year;
	private int month;
	private double totalAmount;
	private Map<Category, Double> breakdown;
	
	public ReportDto(int year, int month, double totalAmount, Map<Category, Double> breakdown) {
		this.year = year;
		this.month = month;
		this.totalAmount = totalAmount;
		this.breakdown = breakdown;
	}
	
	// --- getters ---
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public double getTotalAmount() {return totalAmount;}
	public Map<Category, Double> getBreakdown() {return breakdown;}
}
