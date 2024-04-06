package com.shuffler.OTL.domain.hello.service.Impl

import com.shuffler.OTL.domain.hello.entity.Name
import com.shuffler.OTL.domain.hello.service.HelloService


class HelloServicelmpl2 : HelloService {
    override fun helloMessage(name: String): String {
        return "${name}님 안녕하세요"
    }

    override fun findAllName(): List<Name> {
        TODO("Not yet implemented")
    }
}