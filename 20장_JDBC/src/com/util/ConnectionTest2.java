package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vo.EmpVO;

public class ConnectionTest2 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "test1";
		String pw = "1234";
		String sql = "SELECT * FROM EMP";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println(con);

			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println(pstmt);

			ResultSet rs = pstmt.executeQuery();

			// 리스트를 생성
			List<EmpVO> list = new ArrayList<EmpVO>();

			while (rs.next()) {
				String empName = rs.getString(1);
				String empId = rs.getString(2);
				String empNo = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String deptCode = rs.getString(6);
				String jobCode = rs.getString(7);
				int salary = rs.getInt(8);
				float bonus = rs.getFloat(9);
				String managerId = rs.getString(10);
				Date hireDate = rs.getDate(11);
				Date entDate = rs.getDate(12);
				String entYn = rs.getString(13);
				// 사원을 생성해서 리스트에 담기
				EmpVO emp = new EmpVO(empId, empName, empNo, email, phone 
						, deptCode, jobCode, salary, bonus, managerId, hireDate, entDate, entYn);
				emp.setEmp_id(empId);
				emp.setEmp_name(empName);
				emp.setEmp_no(empNo);
				list.add(emp);
			}

			for (EmpVO emp : list) {
				System.out.println(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션객체 생성 실패");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
	}
}
