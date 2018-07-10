package com.haridu.amazon.controller;

import com.haridu.amazon.model.Account;
import com.haridu.amazon.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    @PostMapping()
    public Account saveAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }
}
