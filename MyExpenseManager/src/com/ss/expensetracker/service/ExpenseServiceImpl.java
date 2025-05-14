package com.ss.expensetracker.service;

import com.ss.expensetracker.model.Category;
import com.ss.expensetracker.model.Expense;
import com.ss.expensetracker.repository.ExpenseRepository;
import java.time.LocalDate;
import java.util.Map;
import java.util.List;

/**
 * ExpenseService의 구현체
 */
public class ExpenseServiceImpl implements ExpenseService {
	// 수입, 지출 항목의 생성, 수정, 삭제, 조회 같은 기본 CRUD 로직
	private final ExpenseRepository expenseRepository;
	
	public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	@Override
	public void addExpense(Expense expense) {
		// 금액 검증
		
	}
	
	@Override
	public List<Expense> getAllExpenses(){
		return expenseRepository.findAll();
	}
	
	@Override
	public double getTotalAmount(LocalDate from, LocalDate to) {
		
		return list.stream();
	}
	
	@Override
	public Map<Category, Double> getTotalByCategory(LocalDate from, LocalDate to){
		
		return 
	}
}
