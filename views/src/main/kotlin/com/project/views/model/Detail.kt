package com.project.views.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "quantity", nullable = false)
    var quantity: Int? = null

    @Column(name = "price", nullable = false)
    var price: BigDecimal? = null

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    var invoice: Invoice? = null

    @ManyToOne
    @JoinColumn(name = "product_id")
    var product: Product? = null
}

