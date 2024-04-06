package com.shuffler.OTL.domain.message.repository

import com.shuffler.OTL.domain.message.entity.Message

interface MessageRepository {
    fun returnMessage(): List<Message>

    fun sendMessage(message: String)

    fun updateMessage(id: Long, message: String)

    fun deleteMessage(id: Long)
}