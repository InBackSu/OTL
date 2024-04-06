package com.shuffler.OTL.domain.message.service.impl

import com.shuffler.OTL.domain.message.entity.Message
import com.shuffler.OTL.domain.message.repository.MessageRepository
import com.shuffler.OTL.domain.message.service.MessageService
import org.springframework.stereotype.Service

@Service
class MessageServiceImpl(val messageRepository: MessageRepository) : MessageService {
    override fun getMessage(): List<Message> {
        return messageRepository.returnMessage()
    }

    override fun postMessage(message: String) {
        messageRepository.sendMessage(message)
    }

    override fun deleteMessage(id: Long) {
        messageRepository.deleteMessage(id)
    }

    override fun patchMessage(id: Long, message: String) {
        messageRepository.updateMessage(id, message)
    }
}