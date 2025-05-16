package com.ss.expensetracker.service;

import java.util.List;

import com.ss.expensetracker.dto.CategorySumDto;
import com.ss.expensetracker.dto.ReportDto;

public interface ReportService {
	/** 월별 총 지출, 수입, 잔액 요약 리포트 생성 */
	ReportDto getMonthlyReport(int year, int month);
	
	/** 카테고리별 월별 지출 합계 리스트 생성 */
	List<CategorySumDto> getCategorySum(int year, int month);
}
