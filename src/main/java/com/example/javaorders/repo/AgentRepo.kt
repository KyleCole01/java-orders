package com.example.javaorders.repo

import com.example.javaorders.model.Agent
import org.springframework.data.jpa.repository.JpaRepository


interface AgentRepo : JpaRepository<Agent, Long>