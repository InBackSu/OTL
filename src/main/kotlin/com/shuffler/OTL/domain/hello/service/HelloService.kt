package com.shuffler.OTL.domain.hello.service

import com.shuffler.OTL.domain.hello.entity.Name

interface HelloService {
    fun helloMessage(name: String): String
    fun findAllName(): List<Name>
}