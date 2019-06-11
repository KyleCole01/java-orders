package com.example.javaorders.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

import javax.persistence.*
import java.util.ArrayList

@Entity
@Table(name = "agents")
class Agent(agentname: String, workingarea: String, commission: Double, phone: String, country: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var agentcode: Long = 0
    var agentname: String? = null
    var workingarea: String? = null
    var commission: Double = 0.toDouble()
    var phone: String? = null
    var country: String? = null

    @OneToMany(mappedBy = "agent", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnoreProperties("agents")
    var customers: List<Customer> = ArrayList<Customer>()

    @OneToMany(mappedBy = "agent", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnoreProperties("agents")
    var orders: List<Order> = ArrayList()


}