package com.ss.expensetracker.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.ss.expensetracker.model.Expense;

/** 데이터 접근 계층(DAO): 지출 데이터를 저장, 조회하는 인터페이스 */
public interface ExpenseRepository {
	
	/** 지출 항목 저장 */
	 void save(Expense expense);
	 
	 /** 모든 지출 목록 조회 */
	 List<Expense> findAll();
	 
	 /** 특정 기간 내 지출 목록 조회 */
	 List<Expense> findByDateBetween(LocalDate from, LocalDate to);
	 
	 /** ID로 단건 조회: 없으면 Optional.empty() */
	 Optional<Expense> findById(Long id);
}
