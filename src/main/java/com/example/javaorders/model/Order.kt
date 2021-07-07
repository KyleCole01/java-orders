package com.example.javaorders.model

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*

@Entity
@Table(name = "orders")
class Order (ordamount: Double, advanceamount: Double, customer: Customer, agents: Agent, ordersescription: String){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var ordnum: Long = 0

    var ordamount: Double = 0.toDouble()
    var advanceamount: Double = 0.toDouble()
    var ordersescription: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custcode", nullable = false)
    @JsonIgnore
    var customer: Customer? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agentcode", nullable = false)
    @JsonIgnore
    var agent: Agent? = null

}