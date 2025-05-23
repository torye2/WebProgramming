package com.ss.expensetracker.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ss.expensetracker.model.Expense;

/**
 * 메모리 기반 ExpenseRepository 구현체
 */
public class InmemoryExpenseRepository implements ExpenseRepository {
	private final List<Expense> store = new ArrayList<>();
	
	@Override
	public void save(Expense expense) {
		// 단순 저장: 리스트에 추가
		store.add(expense);
	}
	
	@Override
	public List<Expense> findAll(){
		// 외부 변경 방지를 위해 원본이 아닌 복사본 반환
		return new ArrayList<>(store);
	}
	
	@Override
	public List<Expense> findByDateBetween(LocalDate from, LocalDate to){
		// form부터 to 날짜 사이의 항목만 필터링
		return store.stream()
				.filter(e -> !e.getDate().isBefore(from) && !e.getDate().isAfter(to))
				.collect(Collectors.toList());
	}
	
	@Override
	public Optional<Expense> findById(Long id){
		
		return store.stream()
				.filter(e -> e.getId(id).equals(id)) // ID가 일치하는 필터
				.findFirst(); // 첫 엔티티를 반환
	}
}
