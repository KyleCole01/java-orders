package com.example.javaorders.repo

import com.example.javaorders.model.Order
import org.springframework.data.jpa.repository.JpaRepository


interface OrderRepo : JpaRepository<Order, Long>