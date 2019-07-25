package com.village.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {

    @GetMapping("/village")
    fun startPage(model: Model): String {
        model["title"] = "Test Village"
        return "village"
    }

    @GetMapping("/")
    fun indexPage(model: Model): String {
        return "admin/index"
    }
}

