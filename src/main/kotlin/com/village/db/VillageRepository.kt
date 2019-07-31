package com.village.db

import com.village.model.Village
import org.springframework.data.repository.CrudRepository

interface VillageRepository : CrudRepository<Village, Long> {
    fun findByDescription(name: String): List<Village>
}