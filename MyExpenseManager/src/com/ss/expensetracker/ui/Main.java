package com.ss.expensetracker.ui;

import com.ss.expensetracker.repository.ExpenseRepository;
import com.ss.expensetracker.repository.InmemoryExpenseRepository;
import com.ss.expensetracker.service.ExpenseService;
import com.ss.expensetracker.service.ExpenseServiceImpl;
import com.ss.expensetracker.service.ReportService;
import com.ss.expensetracker.service.ReportServiceImpl;
import com.ss.expensetracker.util.InputHelper;

public class Main {

	public static void main(String[] args) {
		ExpenseRepository expenseRepository = new InmemoryExpenseRepository();
		ExpenseService expenseService = new ExpenseServiceImpl(expenseRepository);
		ReportService reportService = new ReportServiceImpl(expenseService);
		InputHelper inputHelper = new InputHelper();
		
		ConsoleUI cu = new ConsoleUI(expenseService, reportService, inputHelper);
		
		cu.start();
	}
}
