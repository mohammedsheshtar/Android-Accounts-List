package com.muhammed.accountslist.repositories

import com.muhammed.accountslist.data.AccountStatements
import java.math.BigDecimal
import java.util.Date

object AccountRepository {
    fun getAccountStatements(): List<AccountStatements> {
        return listOf(
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(100.0), "USD"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(50.0), "KWD"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(200.0), "SAR"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(30.0), "AED"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(100.0), "USD"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(50.0), "KWD"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(200.0), "SAR"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(30.0), "AED"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(100.0), "USD"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(50.0), "KWD"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(200.0), "SAR"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(30.0), "AED"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(100.0), "USD"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(50.0), "KWD"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(200.0), "SAR"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(30.0), "AED"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(100.0), "USD"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(50.0), "KWD"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(200.0), "SAR"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(30.0), "AED"),
        )
    }
}
