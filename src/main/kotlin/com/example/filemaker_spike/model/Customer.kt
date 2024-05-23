package com.example.filemaker_spike.model


data class Customer (
    val id: Int,
    val name: String,
    val address: List<Address>
)