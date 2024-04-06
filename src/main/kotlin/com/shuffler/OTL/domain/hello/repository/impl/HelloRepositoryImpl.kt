package com.shuffler.OTL.domain.hello.repository.impl

import com.shuffler.OTL.domain.hello.entity.Name
import com.shuffler.OTL.domain.hello.repository.HelloRepository
import org.springframework.stereotype.Repository

@Repository
class HelloRepositoryImpl : HelloRepository {
    companion object{
        var nameMap = mutableMapOf<Long, Name>()
        var sequence: Long = 0
    }

    override fun saveName(name: String) {
        val nameEntity = Name(++sequence, name)
        nameMap.put(sequence, nameEntity)
    }

    override fun findNameList(): List<Name> {
        return nameMap.values.toList()
    }

}