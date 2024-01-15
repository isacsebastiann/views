package com.project.views.controller

import com.project.views.model.Detail
import com.project.views.services.DetailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/detail")
class DetailController {
    @Autowired
    lateinit var detailService: DetailService

    @GetMapping
    fun list(): List<Detail> {
        return detailService.list()
    }
    @GetMapping("/{id}")
    fun listById(@PathVariable("id") id: Long): ResponseEntity<*> {
        return ResponseEntity(detailService.listById(id), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.save(detail), HttpStatus.OK)
    }

    @PutMapping
    fun update(@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.update(detail), HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<Boolean?> {
        return ResponseEntity(detailService.delete(id), HttpStatus.OK)
    }
}

