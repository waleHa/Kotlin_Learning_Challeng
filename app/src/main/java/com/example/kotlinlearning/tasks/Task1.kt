package com.example.kotlinlearning.tasks

/*
Bank Cards
 /
  Banks

  ACME 1121
  ALFA 1111
  AMEX 3796

  Sample input
  -> 1121-0000-0000-0312  -- Expiry Date (03/12)
  -> First 4 digit represent company
  -> Last 4 digit represent expiry date

 Assuming card and date as input write a function to verify valid card numbers
  */
import java.time.LocalDate
import java.time.format.DateTimeFormatter

val validCompanyCodes = setOf("1121", "1111", "3796")

fun verifyCard(bankCardNumbers: Long): Boolean {
    val cardString = bankCardNumbers.toString()
    val companyCode = cardString.substring(0, 4)
    val expiryDateString = cardString.substring(cardString.length - 4)

    // Check if the first two digits represent a valid month (1-12)
    val expiryMonth = expiryDateString.substring(0, 2).toIntOrNull()
    if (expiryMonth == null || expiryMonth !in 1..12) {
        return false
    }

    // Get the current date
    val currentDate = LocalDate.now()

    // Parse the expiry date string to LocalDate
    val expiryDate = LocalDate.parse(expiryDateString, DateTimeFormatter.ofPattern("MMyy"))

    // Check if the expiry date is in the future
    return expiryDate.isAfter(currentDate) && validCompanyCodes.contains(companyCode)
}

fun main() {
    val cardNumber = 112100000000312
    if (verifyCard(cardNumber)) {
        println("Card is valid")
    } else {
        println("Card is invalid")
    }
}
