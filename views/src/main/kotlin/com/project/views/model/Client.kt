package com.project.views.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "fullname", nullable = false)
    var fullname: String? = null

    @Column(name = "address", nullable = false)
    var address: String? = null
    @Column(name= "email", nullable = false)
    var email: String?= null
}
