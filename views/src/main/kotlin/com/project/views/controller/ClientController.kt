package com.project.views.controller

import com.project.views.model.Client
import com.project.views.services.ClientService
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
@RequestMapping("/client")
class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client> {
        return clientService.list()
    }
    @GetMapping("/{id}")
    fun listById(@PathVariable("id") id: Long): ResponseEntity<*> {
        return ResponseEntity(clientService.listById(id), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.save(client), HttpStatus.OK)
    }

    @PutMapping
    fun update(@RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.update(client
                ), HttpStatus.OK)
    }

    //@PatchMapping
    //fun updateName(@RequestBody client: Client): ResponseEntity<Client> {
      //  return ResponseEntity(clientService.updateName(client), HttpStatus.OK)
    //}

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<Boolean?> {
        return ResponseEntity(clientService.delete(id), HttpStatus.OK)
    }
}