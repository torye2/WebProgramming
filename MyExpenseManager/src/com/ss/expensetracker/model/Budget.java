package com.ss.expensetracker.model;

import java.time.YearMonth;
import java.util.Locale.Category;

public class Budget {
	private Category category;
	private int limitAmount; // 월별 예산 한도
	private YearMonth month; // 적용 월
}
