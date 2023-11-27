package com.project.views.repository

import com.project.views.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository :JpaRepository<Client, Long?> {
    fun findById(id: Long?): Client?
}