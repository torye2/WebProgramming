package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest_Insert {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "test1";
		String pw = "1234";
		
		// emp_id는 기본키(PK)이므로 중복될 수 없다
		String sql = "INSERT INTO EMP (EMP_ID, EMP_NAME, EMP_NO, JOB_CODE)\r\n"
				//+ "VALUES ('224', '강유경', '111111-4222222', 'J2')";
				+ "VALUES (?, ?, ?, ?)";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "225"); // 기본키
			pstmt.setString(2, "강유경");
			pstmt.setString(3, "111111-4222222");
			pstmt.setString(4, "J2");
			// 입력, 수정, 삭제는 반환 타입을 건 수만큼 숫자로 받는다
			int res = pstmt.executeUpdate();
			if(res > 0) {
				System.out.println("입력 성공");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션객체 생성 실패");
		}
	}
}
