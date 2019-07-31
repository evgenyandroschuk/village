package com.village.controller

import com.village.db.VillageRepository
import com.village.model.Village
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController(var repository: VillageRepository) {

    @GetMapping("/village")
    fun startPage(model: Model): String {
        model["title"] = "Test Village"
        return "village"
    }

    @GetMapping("/")
    fun indexPage(model: Model): String {

        var vil = repository.findById(1)
        println("VILLAGE = ${vil.get().description} ${vil.get().owner}")
        return "admin/index"
    }
}

