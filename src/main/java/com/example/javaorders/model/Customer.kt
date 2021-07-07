package com.example.javaorders.model

import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.util.ArrayList

@Entity
@Table(name = "customers")
class Customer(custname: String, custcity: String, workingarea: String, custcountry: String, grade: String, openingamt: Double, receiveamt: Double, paymentamt: Double, outstandingamt: Double, phone: String, agent: Agent) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var custcode: Long = 0

    @Column(nullable = false)
    var custname: String? = null

    var custcity: String? = null
    var workingarea: String? = null
    var custcountry: String? = null
    var grade: String? = null
    var openingamt: Double = 0.toDouble()
    var receiveamt: Double = 0.toDouble()
    var paymentamt: Double = 0.toDouble()
    var outstandingamt: Double = 0.toDouble()
    var phone: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agentcode", nullable = false)
    @JsonIgnoreProperties("customers", "hibernateLazyInitializer")
    var agent: Agent? = null

    @OneToMany(mappedBy = "customer", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnoreProperties("customers")
    var orders: List<Order> = ArrayList<Order>()

}
