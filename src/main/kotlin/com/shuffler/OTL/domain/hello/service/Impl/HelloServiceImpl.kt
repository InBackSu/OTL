package com.shuffler.OTL.domain.hello.service.Impl

import com.shuffler.OTL.domain.hello.entity.Name
import com.shuffler.OTL.domain.hello.repository.HelloRepository
import com.shuffler.OTL.domain.hello.service.HelloService
import org.springframework.stereotype.Service

@Service
class HelloServiceImpl(val helloRepository: HelloRepository) : HelloService {
    override fun helloMessage(name: String): String{
        helloRepository.saveName(name)
        return "${name}님 Hello"
    }

    override fun findAllName(): List<Name> {
        return helloRepository.findNameList()
    }
}