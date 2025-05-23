package com.ss.expensetracker.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.ss.expensetracker.dto.ExpenseCreateDto;
import com.ss.expensetracker.dto.ExpenseUpdateDto;
import com.ss.expensetracker.model.Category;
import com.ss.expensetracker.model.Expense;

/**
 * 비즈니스 계층: 지출(Expense) 관련 주요 로직 처리
 */
public interface ExpenseService{
	void addExpense(Expense expense); // 새로운 지출 항목 추가
	
	List<Expense> getAllExpenses(); // 전체 지출 목록 조회
	
	// from부터 to 사이 날짜의 지출 금액을 합산해서 반환
	double getTotalAmount(LocalDate from, LocalDate to);
	
	// from부터 to 사이 날짜의 카테고리별 지출 금액을 합산해서 반환
	Map<Category, Double> getTotalByCategory(LocalDate from, LocalDate to);
	
	// 새 지출 요청용 DTO
	Expense createExpense(ExpenseCreateDto dto);
	// 기존 지출 요청용 DTO
	Expense updateExpense(ExpenseUpdateDto dto);
}