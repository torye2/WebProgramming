package com.lib.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private boolean adminYN;
	private String admin;

}
