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
	private long sequence = 0L; // 시퀀스 카운터: 마지막에 발급된 ID 값
	
	@Override
	public void save(Expense expense) {
		if(expense.getId() == null) {
			// 신규 저장: addExpense에서 save 호출 시
			expense.setId(++sequence); // 1 증가시킨 후 그 값을 ID에 할당
			store.add(expense);
		} else {
			// 업데이트: updateExpense에서 save 호출 시
			// 기존 리스트에서 동일 ID를 가진 객체를 찾아 교체
			for(int i = 0; i < store.size(); i++) {
				if(store.get(i).getId().equals(expense.getId())) {
					store.set(i, expense);
					return;
				}
			}
		}
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
				.filter(e -> e.getId().equals(id)) // ID가 일치하는 필터
				.findFirst(); // 첫 엔티티를 반환
	}
}
