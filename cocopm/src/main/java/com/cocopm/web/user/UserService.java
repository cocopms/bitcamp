package com.cocopm.web.user;

public interface UserService {

	public void add(User user);

	public int count();

	public User login(User user); //비밀번호는 민감정보라 따로..
	public User detail(String userid); //관리자 검색용
}