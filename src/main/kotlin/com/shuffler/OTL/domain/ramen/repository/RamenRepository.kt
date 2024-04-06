package com.shuffler.OTL.domain.ramen.repository

import com.shuffler.OTL.domain.ramen.entity.Ramen

interface RamenRepository {
    fun save(ramen: Ramen)
    fun findById(id: Long): Ramen
    fun findAll(): List<Ramen>
    fun clearStore()
}