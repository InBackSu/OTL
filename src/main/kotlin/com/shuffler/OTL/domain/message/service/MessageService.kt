package com.shuffler.OTL.domain.message.service

import com.shuffler.OTL.domain.message.entity.Message

interface MessageService {
    fun getMessage(): List<Message>

    fun postMessage(message: String)

    fun deleteMessage(id: Long)

    fun patchMessage(id: Long, message: String)
}