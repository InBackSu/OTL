package com.shuffler.OTL.domain.message.controller

import com.shuffler.OTL.domain.message.entity.Message
import com.shuffler.OTL.domain.message.repository.MessageRepository
import com.shuffler.OTL.domain.message.service.MessageService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/message")
class MessageController(val messageService: MessageService) {
    // C R U D
    @GetMapping
    fun getMessage(): ResponseEntity<List<Message>> {
        return ResponseEntity(messageService.getMessage(),HttpStatus.OK)
    }

    @PostMapping
    fun postMessage(@RequestParam message: String) {
        messageService.postMessage(message)
    }

    @DeleteMapping
    fun deleteMessage(@RequestParam id: Long) {
        messageService.deleteMessage(id)
    }

    @PatchMapping
    fun patchMessage(@RequestParam id: Long, @RequestParam message: String) {
        messageService.patchMessage(id, message)
    }
}