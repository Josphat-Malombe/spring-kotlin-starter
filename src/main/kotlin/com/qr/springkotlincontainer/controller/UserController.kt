package com.qr.springkotlincontainer.controller

import com.qr.springkotlincontainer.model.User
import com.qr.springkotlincontainer.service.UserService
import org.springframework.security.access.prepost.PostFilter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {
    @GetMapping
    fun getUsers(): List<User>{
        return userService.getAllUsers()

    }
    @PostMapping
    fun createUser(@RequestParam name:String,@RequestParam email: String):User{
        return userService.createUser(name,email)
    }

}