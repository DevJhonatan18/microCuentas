package com.example.demo_account.service;

import java.util.List;

import com.example.demo_account.entity.Account;

public interface IAccountService {

	public List<Account> findAll();
	public Account findById(Integer id);
	public Account save(Account save);
	
}
