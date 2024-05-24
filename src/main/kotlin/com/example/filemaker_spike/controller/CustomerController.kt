package com.example.filemaker_spike.controller

import com.example.filemaker_spike.service.CustomerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CustomerController(val customerService: CustomerService) {

    @GetMapping("/test")
    fun index(model: Model): String {
        model.addAttribute("customers", customerService.getTitleDetails())
        return "index"
    }
}


