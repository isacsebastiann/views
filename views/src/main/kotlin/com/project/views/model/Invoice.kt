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
import java.sql.Timestamp

@Entity
@Table(name = "invoice")
class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "code", unique = true, nullable = false)
    var code: String? = null

    @Column(name = "created_at", nullable = false)
    var createdAt: Timestamp? = null

    @Column(name = "total", nullable = false)
    var total: BigDecimal? = null

    @ManyToOne
    @JoinColumn(name = "client_id")
    var client: Client? = null
}