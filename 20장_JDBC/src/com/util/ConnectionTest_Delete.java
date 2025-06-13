package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest_Delete {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "test1";
		String pw = "1234";
		
		// emp_id는 기본키(PK)이므로 중복될 수 없다
		String sql = "DELETE EMP WHERE EMP_ID IN(200)";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			// 입력, 수정, 삭제는 반환 타입을 건 수만큼 숫자로 받는다
			int res = pstmt.executeUpdate();
			
			if(res > 0) {
				System.out.println(res + "건 삭제 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션객체 생성 실패");
		}
	}
}
