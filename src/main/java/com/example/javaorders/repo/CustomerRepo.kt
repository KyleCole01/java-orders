package com.example.javaorders.repo

import com.example.javaorders.model.Customer
import org.springframework.data.jpa.repository.JpaRepository


interface CustomerRepo : JpaRepository<Customer, Long>