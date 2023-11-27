package com.project.views.services

import com.project.views.model.Product
import com.project.views.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
<<<<<<< HEAD
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
=======
import org.springframework.stereotype.Service
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45


@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository

    fun list(): List<Product> {
        return productRepository.findAll()
    }
<<<<<<< HEAD
    fun save(product: Product): Product {
        try {
            return productRepository.save(product)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(product: Product): Product {
        try {
            productRepository.findById(product.id)
                ?: throw Exception("ID no existe")

            return productRepository.save(product)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun listById(id: Long?): Product? {
        return productRepository.findById(id)
    }

    fun delete(id: Long?): Boolean? {
        try {
            val response = productRepository.findById(id)
                ?: throw Exception("ID no existe")
            productRepository.deleteById(id!!)
            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
=======
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45
}
