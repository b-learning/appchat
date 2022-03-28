
package com.example.appchat.controller;

import com.example.appchat.entity.TestEntity;
import com.example.appchat.repository.TestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestAPI {
    
    @Autowired
    TestRepository testRepository;
    
    @GetMapping("/test")
    public ResponseEntity test(){
        List<TestEntity> listTest = testRepository.findAll();
        return ResponseEntity.ok(listTest);
    }
}
