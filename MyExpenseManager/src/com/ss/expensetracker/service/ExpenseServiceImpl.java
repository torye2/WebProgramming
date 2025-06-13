package com.ss.expensetracker.service;

import com.ss.expensetracker.dto.ExpenseCreateDto;
import com.ss.expensetracker.dto.ExpenseUpdateDto;
import com.ss.expensetracker.model.Category;
import com.ss.expensetracker.model.Expense;
import com.ss.expensetracker.repository.ExpenseRepository;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.List;

/**
 * ExpenseService의 구현체
 */
public class ExpenseServiceImpl implements ExpenseService {
	// 수입, 지출 항목의 생성, 수정, 삭제, 조회 같은 기본 CRUD 로직
	private final ExpenseRepository expenseRepository;
	
	// 생성자 선언부, 외부에서 ExpenseRepository를 받아옴
	public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	// 새로운 지출을 서비스 계층에서 등록하는 진입점
	@Override
	public void addExpense(Expense expense) {
		// 금액 검증
		if(expense.getAmount() <= 0) {
			throw new IllegalArgumentException("올바른 값을 입력해주세요.");
		}
		
		// 날짜 검증
		if(expense.getDate().isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("올바른 날짜를 입력해주세요.");
		}
		
		// 검증을 통과한 객체를 DAO의 save() 메서드로 전달하여 저장
		expenseRepository.save(expense);
	}
	
	// 저장된 모든 지출 내역을 조회
	@Override
	public List<Expense> getAllExpenses(){
		return expenseRepository.findAll();
	}
	
	// 지정한 날짜 범위의 총 지출 금액 계산
	@Override
	public double getTotalAmount(LocalDate from, LocalDate to) {

		List<Expense> list = expenseRepository.findByDateBetween(from, to);
		
		return list.stream()
				.mapToDouble(Expense::getAmount)
				.sum();
	}
	
	// 날짜 범위 내 지출을 카테고리별로 합산해서 반환
	@Override
	public Map<Category, Double> getTotalByCategory(LocalDate from, LocalDate to){
		
		List<Expense> list = expenseRepository.findByDateBetween(from, to);
		
		return list.stream()
				.collect(Collectors.groupingBy(Expense::getCategory, 
						Collectors.summingDouble(Expense::getAmount)));
	}
	
	@Override
	public Expense createExpense(ExpenseCreateDto dto) {
		Expense expense = new Expense(
				dto.getCategory(),
				dto.getMemo(),
				dto.getAmount(),
				dto.getDate());
		
		addExpense(expense);		
		
		return expense;
	}
	
	@Override
	public Expense updateExpense(ExpenseUpdateDto dto) {
		// 1. 기존 엔티티 조회
		Expense exist = expenseRepository.findById(dto.getId())
				.orElseThrow(() -> new NoSuchElementException("ID = " + dto.getId() 
				+ "인 지출이 없습니다."));
		
		// 2. DTO에 담긴 값만 골라서 반영
		if(dto.getCategory() != null)
			exist.setCategory(dto.getCategory());
		if(dto.getAmount() != null) {
			if(dto.getAmount() <= 0) {
				throw new IllegalArgumentException("금액은 반드시 양수여야합니다.");
			}
			exist.setAmount(dto.getAmount());
		}
		if(dto.getDate() != null) {
			if(dto.getDate().isAfter(LocalDate.now()))
				throw new IllegalArgumentException("날짜는 현재보다 미래가 될 수 없습니다.");
			exist.setDate(dto.getDate());
		}
		if(dto.getMemo() != null) 
			exist.setMemo(dto.getMemo());
		
		// 3. 변경된 엔티티 저장
		expenseRepository.save(exist);
		
		return exist;
	}
}
