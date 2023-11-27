package com.project.views.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "product")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "description", nullable = false)
    var description: String? = null

    @Column(name = "brand", nullable = false)
    var brand: String? = null

    @Column(name = "price", nullable = false)
    var price: BigDecimal? = null

    @Column(name = "stock", nullable = false)
    var stock: Int? = null
}

