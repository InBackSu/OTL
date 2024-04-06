package com.shuffler.OTL.domain.ramen.controller

import com.shuffler.OTL.domain.ramen.entity.Ramen
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class RamenController {
//
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @PostMapping("/ramen")
//    fun submitRamen(
//        @RequestParam("waterTemp") waterTemp: Int,
//        @RequestParam("ramen") ramen: String
//    ): Long {
//
//    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @GetMapping("/ramen")
    fun getRamen(): Int {
        return 0
    }


}