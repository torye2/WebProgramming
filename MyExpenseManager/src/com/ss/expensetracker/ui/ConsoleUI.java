package com.ss.expensetracker.ui;

import java.time.LocalDate;
import java.util.List;

import com.ss.expensetracker.dto.CategorySumDto;
import com.ss.expensetracker.dto.ExpenseCreateDto;
import com.ss.expensetracker.dto.ExpenseUpdateDto;
import com.ss.expensetracker.dto.ReportDto;
import com.ss.expensetracker.model.Category;
import com.ss.expensetracker.model.Expense;
import com.ss.expensetracker.service.ExpenseService;
import com.ss.expensetracker.service.ReportService;
import com.ss.expensetracker.util.InputHelper;

public class ConsoleUI {
	private final ExpenseService expenseService;
	private final ReportService reportService;
	private final InputHelper input;
	
	public ConsoleUI(ExpenseService expenseService, ReportService reportService,
			InputHelper input) {
		this.expenseService = expenseService;
		this.reportService = reportService;
		this.input = input;
	}
	
	public void start() {
		while(true) {
			showMenu();
			int menu = input.readInt("메뉴 선택");
			switch(menu) { // 1. 등록, 2. 조회, 3. 수정, 4. 리포트, 5. 종료 등
			case 1:
				registerExpense();
				continue;
			case 2:
				listAllExpenses();
				break;
			case 3:
				updateExpense();
				continue;
			case 4:
				int sel = input.readInt("1. 월간 리포트\n2. 카테고리별 월간 리포트");
				if(sel == 1)
					showMonthlyReport();
				else if(sel == 2)
					showCategorySum();
				else
					System.out.println("잘못입력하셨습니다.");
				break;
			case 5:
				break;
			}
			break;
		}
	}
	
	/** 메뉴 항목 출력 */
	private void showMenu() {
		System.out.println("\n===== 가계부 메뉴 =====");
		System.out.println("1. 지출 등록");
		System.out.println("2. 지출 조회");
		System.out.println("3. 지출 수정");
		System.out.println("4. 지출 리포트");
		System.out.println("5. 종료");
	}
	
	/** 지출 등록 입력 */
	private void registerExpense() {
		Category category = promptForCategory();
		String memo = input.readLine("메모");
		int amount = input.readInt("금액");
		LocalDate date = input.readDate("날짜");
		ExpenseCreateDto dto = new ExpenseCreateDto(category, memo, amount, date);
		expenseService.createExpense(dto);
		System.out.println("지출이 등록되었습니다.");
	}
	
	/** 카테고리 입력처리 */
	private Category promptForCategory() {
		Category[] cats = Category.values();
		for(int i = 0; i < cats.length; i++) {
			System.out.printf("%d. %s\n", i+1, cats[i]);
		}
		int idx = input.readInt("카테고리 번호") - 1;
		
		return cats[idx];
	}
	
	/** 지출 조회 */
	private void listAllExpenses() {
		List<Expense> list = expenseService.getAllExpenses();
		if(list.isEmpty())
			System.out.println("등록된 지출이 없습니다.");
		else
			list.forEach(e -> System.out.println(e)); // toString() 출력
	}
	
	/** 지출 수정 */
	private void updateExpense() {
		// ID 입력 -> findById의 예외 처리 발생
		long id = input.readInt("수정할 지출 ID");
		Category cat = promptForCategory();
		String memo = input.readLine("새 메모 (취소 = Enter)");
		int amount = input.readInt("새 금액 (취소 = 0)");
		LocalDate date = input.readDate("새 날짜");
		ExpenseUpdateDto dto = new ExpenseUpdateDto(id, cat, amount, date, memo);
		Expense update = expenseService.updateExpense(dto);
		System.out.println("수정 완료: " + update);
	}
	
	/** 월별 지출 리포트 */
	private void showMonthlyReport() {
		int year = input.readInt("연도");
		int month = input.readInt("월(1 ~ 12)");
		ReportDto report = reportService.getMonthlyReport(year, month);
		System.out.printf("== %d년 %d월 리포트 ==\n", year, month);
		System.out.println("총 지출: " + report.getTotalAmount());
		report.getBreakdown().forEach((c, ta) -> 
		System.out.printf(" %s : %.2f\n", c, ta));
	}
	
	/** 카테고리별 월간 리포트 */
	private void showCategorySum() {
		int year = input.readInt("연도");
		int month = input.readInt("월(1 ~ 12)");
		List<CategorySumDto> list = reportService.getCategorySum(year, month);
		list.forEach(d -> System.out.printf(" %s : %.2f\n", d.getCategory(), d.getAmount()));
	}
}
