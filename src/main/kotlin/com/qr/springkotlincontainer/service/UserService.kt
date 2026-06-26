package com.qr.springkotlincontainer.service

import com.qr.springkotlincontainer.model.User
import com.qr.springkotlincontainer.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers():List<User>{
        return userRepository.findAll()
    }

    fun createUser(name:String,email:String):User {
        val newUser=User(name=name,email=email)
        return userRepository.save(newUser)
    }

}