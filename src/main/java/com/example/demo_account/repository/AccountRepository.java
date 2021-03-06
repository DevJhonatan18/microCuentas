package com.example.demo_account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_account.entity.Account;


@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

}
