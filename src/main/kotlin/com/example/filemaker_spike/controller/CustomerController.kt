package com.example.filemaker_spike.controller

import com.example.filemaker_spike.service.CustomerService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute

@Controller
class CustomerController(val customerService: CustomerService) {

    @GetMapping("/test")
    fun index(@ModelAttribute("model") model: ModelMap): String {
        model.addAttribute("customers", customerService.getCustomers())
        return "index"
    }

}
