package com.example.filemaker_spike.service

import com.example.filemaker_spike.model.Address
import com.example.filemaker_spike.model.Customer
import org.springframework.stereotype.Service

@Service
class CustomerService {

    fun getCustomers(): List<Customer> {
        return listOf(
            Customer(
                1,
                "Alice",
                listOf(Address(street = "s1", city = "c1"), Address(street = "s2", city = "c2"))
            ),
            Customer(
                2, "Bob",
                listOf(Address(street = "s3", city = "c3"), Address(street = "s4", city = "c4"))
            )
        )
    }

    fun getTitleDetails(): TitleDetailsDto {
        return TitleDetailsDto(
                "Title1",
                "Details1",
                listOf(
                    Address(street = "s1", city = "c1"),
                    Address(street = "s2", city = "c2")
                )
            )
    }


}


data class TitleDetailsDto(
    val title: String,
    val details: String,
    val addresses: List<Address>
)

data class Address (
    val street: String,
    val city: String,
)
