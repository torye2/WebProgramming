package com.object.practice;

import com.object.practice.MemberService;

public class MemberServiceImpl implements MemberService{
		
		@Override
		public boolean login(String id, String password){
			
			boolean res;
			
			if( id == "hong" && password == "12345")
				res = true;
			else
				res = false;
			
			return res;
		}
		
		@Override
		public void logout(String id) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
}

