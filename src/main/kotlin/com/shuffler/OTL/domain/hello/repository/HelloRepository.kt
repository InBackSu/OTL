package com.shuffler.OTL.domain.hello.repository

import com.shuffler.OTL.domain.hello.entity.Name

interface HelloRepository {
    fun saveName(name: String)
    fun findNameList(): List<Name>
}