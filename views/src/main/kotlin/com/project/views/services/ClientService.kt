package com.project.views.services


import com.project.views.model.Client
import com.project.views.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
<<<<<<< HEAD
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
=======
import org.springframework.stereotype.Service
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45


@Service
class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository

    fun list(): List<Client> {
        return clientRepository.findAll()
    }
<<<<<<< HEAD

    fun save(client: Client): Client {
        try {
            return clientRepository.save(client)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(client: Client): Client {
        try {
            clientRepository.findById(client.id)
                ?: throw Exception("ID no existe")

            return clientRepository.save(client)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun listById(id: Long?): Client? {
        return clientRepository.findById(id)
    }

    fun delete(id: Long?): Boolean? {
        try {
            val response = clientRepository.findById(id)
                ?: throw Exception("ID no existe")
            clientRepository.deleteById(id!!)
            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
=======
>>>>>>> a421182686aabb4bf853d2ae234824ae90c36c45
}

