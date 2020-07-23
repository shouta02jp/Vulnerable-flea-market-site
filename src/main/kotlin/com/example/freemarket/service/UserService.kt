package com.example.freemarket.service

import com.example.freemarket.model.Users

interface UserService {
    fun save(user: Users)
    fun findByUserid(userid: String): Users?
    fun findAll(): Iterable<Users>?
}