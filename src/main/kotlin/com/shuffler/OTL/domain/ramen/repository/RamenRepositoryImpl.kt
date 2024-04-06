package com.shuffler.OTL.domain.ramen.repository

import com.shuffler.OTL.domain.ramen.entity.Ramen
import org.springframework.stereotype.Repository

@Repository
class RamenRepositoryImpl : RamenRepository {
    companion object{
        var ramenMap = mutableMapOf<Long, Ramen>()
        var sequence: Long = 0
    }

    override fun save(ramen: Ramen) {
        ramen.id = ++sequence
        ramenMap.put(sequence, ramen)
    }

    override fun findById(id: Long): Ramen {
        return ramenMap.get(id)!!
    }

    override fun findAll(): List<Ramen> {
        return ramenMap.values.toList()
    }

    override fun clearStore() {
        ramenMap.clear()
    }


}