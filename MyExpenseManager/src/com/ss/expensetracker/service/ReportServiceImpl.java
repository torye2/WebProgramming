package com.ss.expensetracker.service;

import java.time.LocalDate;
import java.time.YearMonth;

import com.ss.expensetracker.dto.ReportDto;
import com.ss.expensetracker.service.ReportService;

public class ReportServiceImpl implements ReportService{
	private final ReportService reportService;
	
	// 생성자
	public ReportServiceImpl (ReportService reportService) {
		this.reportService = reportService;
	}
	
	@Override
	public ReportDto getMonthlyReport(int year, int month) {
		
	}
}
