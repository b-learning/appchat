/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appchat.controller;

import com.example.appchat.entity.AccountEntity;
import com.example.appchat.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author giaba
 */
@RestController
@CrossOrigin(origins="*")
public class AccountAPI {
    
    @Autowired
    AccountRepository accountRepository;
    
    @PostMapping("/account")
    public ResponseEntity create(@RequestBody AccountEntity newAccount){
        accountRepository.save(newAccount);
        return ResponseEntity.ok("ok");
    }
    
}
