package com.object.practice;

import com.object.practice.Member;

public interface MemberService {
	
	boolean login(String id, String password);
	
	void logout(String id);
}
