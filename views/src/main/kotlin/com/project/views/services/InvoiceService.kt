package com.project.views.services

import com.project.views.model.Invoice
import com.project.views.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
<<<<<<< HEAD
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
=======
import org.springframework.stereotype.Service
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45


@Service
class InvoiceService {
    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun list(): List<Invoice> {
        return invoiceRepository.findAll()
    }
<<<<<<< HEAD
    fun save(invoice: Invoice): Invoice {
        try {
            return invoiceRepository.save(invoice)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(invoice: Invoice): Invoice {
        try {
            invoiceRepository.findById(invoice.id)
                ?: throw Exception("ID no existe")

            return invoiceRepository.save(invoice)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun listById(id: Long?): Invoice? {
        return invoiceRepository.findById(id)
    }

    fun delete(id: Long?): Boolean? {
        try {
            val response = invoiceRepository.findById(id)
                ?: throw Exception("ID no existe")
            invoiceRepository.deleteById(id!!)
            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
=======
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45
}
