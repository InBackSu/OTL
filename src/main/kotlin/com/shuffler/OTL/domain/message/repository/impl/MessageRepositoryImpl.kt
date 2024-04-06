package com.shuffler.OTL.domain.message.repository.impl

import com.shuffler.OTL.domain.message.entity.Message
import com.shuffler.OTL.domain.message.repository.MessageRepository
import org.springframework.stereotype.Repository

@Repository
class MessageRepositoryImpl : MessageRepository {
    companion object{
        var messageMap = mutableMapOf<Long, Message>()
        var sequence: Long = 0
    }

    override fun returnMessage(): List<Message> {
        return messageMap.values.toList()
    }

    override fun sendMessage(message: String) {
        messageMap.put(++sequence, Message(
            id = sequence,
            message = message
        ))
    }

    override fun updateMessage(id: Long, message: String) {
        messageMap.getValue(id).message = message
    }

    override fun deleteMessage(id: Long) {
        messageMap.remove(id)
    }
}