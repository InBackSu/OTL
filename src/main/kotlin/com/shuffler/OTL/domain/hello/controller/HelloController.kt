package com.shuffler.OTL.domain.hello.controller

import com.shuffler.OTL.domain.hello.entity.Name
import com.shuffler.OTL.domain.hello.service.HelloService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class HelloController(val helloServicelmpl: HelloService) {

    @PostMapping("/toomuchfun")
    fun returnHello(@RequestParam("funName") name: String): String {
        return helloServicelmpl.helloMessage(name)
    }

    @GetMapping("/toomuchfun")
    fun provideAllName(): ResponseEntity<List<Name>> {
        return ResponseEntity(helloServicelmpl.findAllName(), HttpStatus.OK)
    }
}
