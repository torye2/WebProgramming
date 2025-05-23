package com.ss.expensetracker.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ss.expensetracker.dto.CategorySumDto;
import com.ss.expensetracker.dto.ReportDto;
import com.ss.expensetracker.service.ReportService;
import com.ss.expensetracker.model.*;

public class ReportServiceImpl implements ReportService{
	private final ExpenseService expenseService;
	
	// 생성자
	public ReportServiceImpl (ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@Override
	public ReportDto getMonthlyReport(int year, int month) {
		YearMonth ym = YearMonth.of(year, month);
		LocalDate from = ym.atDay(1);
		LocalDate to = ym.atEndOfMonth();
		double totalAmount = expenseService.getTotalAmount(from, to);
		Map<Category, Double> breakdown = expenseService.getTotalByCategory(from, to);
		
		return new ReportDto(year, month, totalAmount, breakdown);
	}
	
	@Override
	public List<CategorySumDto> getCategorySum(int year, int month){
		YearMonth ym = YearMonth.of(year, month);
		LocalDate from = ym.atDay(1);
		LocalDate to = ym.atEndOfMonth();
		
		Map<Category, Double> breakdown = expenseService.getTotalByCategory(from, to);
		
		return breakdown.entrySet()
				.stream()
				.map(e -> new CategorySumDto(e.getKey(), e.getValue()))
				.collect(Collectors.toList());
	}
} 
