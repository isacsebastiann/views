package com.project.views.mappers

import com.project.views.dto.ProductDto
import com.project.views.model.Product

object ProductMapper {
    fun mapToDto(product: Product): ProductDto {
        return ProductDto(
            product.id,
            "${product.description} ${product.brand}"
        )
    }

}