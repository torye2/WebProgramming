package com.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 구조의 생성자
@NoArgsConstructor // 기본 생성자
public class EmpVO {
	String emp_id;
	String emp_name;
	String emp_no;
	String email;
	String phone;
	String dept_code;
	String job_code;
	int salary;
	float bonus;
	String manager_id;
	Date hire_date;
	Date ent_date;
	String ent_yn;
	
}
