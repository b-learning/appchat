/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appchat.repository;

import com.example.appchat.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author giaba
 */
public interface TestRepository extends JpaRepository<TestEntity, Long>{
    
}
