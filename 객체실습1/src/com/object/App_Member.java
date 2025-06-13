package com.object;

import com.object.practice.Member;
import com.object.practice.MemberService;
import com.object.practice.MemberServiceImpl;

public class App_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberServiceImpl ms = new MemberServiceImpl();
		boolean result = ms.login("hong", "12345");
		Member mb = new Member();
		mb.setName("크롱");
		mb.setId("krong");
		mb.setPassword("1234");
		mb.setAge(4);
		System.out.println(mb.getName() + ", " + mb.getId());
		System.out.println(mb.info());
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		} else {
			System.out.println("id 또는 비밀번호가 일치하지 않습니다.");
		}
		
	}

}
