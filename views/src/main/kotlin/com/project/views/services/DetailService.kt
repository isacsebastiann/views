package com.project.views.services

import com.project.views.model.Detail
import com.project.views.model.Product
import com.project.views.repository.DetailRepository
import com.project.views.repository.ProductRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException



@Service
class DetailService {
    @Autowired
    lateinit var detailRepository: DetailRepository

    @Autowired
    lateinit var productRepository: ProductRepository

    fun list(): List<Detail> {
        return detailRepository.findAll()
    }
    @Transactional
    /*fun save(detail: Detail): Detail {
        try {
            return detailRepository.save(detail)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }*/
    fun save(detail: Detail): Detail {
        try{
            val response=detailRepository.save(detail)
            val product=productRepository.findById(detail.productId)
                ?: throw Exception("ID PRODUCT N EXISTS")

            product.apply {
                stock = stock?.minus(detail.quantity!!)
            }
            productRepository.save(product)
            return response
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.BAD_REQUEST,ex.message)
        }
    }
    fun update(detail: Detail): Detail {
        try {
            detailRepository.findById(detail.id)
                ?: throw Exception("ID no existe")

            return detailRepository.save(detail)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun listById(id: Long?): Detail? {
        return detailRepository.findById(id)
    }

    fun delete(id: Long?): Boolean? {
        try {
            val response = detailRepository.findById(id)
                ?: throw Exception("ID no existe")
            detailRepository.deleteById(id!!)
            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

}
