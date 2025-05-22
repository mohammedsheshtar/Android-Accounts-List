package com.muhammed.accountslist.repositories

import com.muhammed.accountslist.data.AccountStatements
import java.math.BigDecimal
import java.util.Date

object AccountRepository {
    fun getAccountStatements(): List<AccountStatements> {
        return listOf (
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(398.0), "USD", "ali_1"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(286.0), "KWD", "sara_2"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(240.0), "SAR", "mohammed_3"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(101.0), "AED", "hamad_4"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(313.0), "USD", "ali_5"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(272.0), "KWD", "sara_6"),
            AccountStatements("Mohammed", "Bank", "Deposit", Date(), BigDecimal(334.0), "SAR", "mohammed_7"),
            AccountStatements("Hamad", "Store", "Withdraw", Date(), BigDecimal(41.0), "AED", "hamad_8"),
            AccountStatements("Ali", "Sara", "Deposit", Date(), BigDecimal(77.0), "USD", "ali_9"),
            AccountStatements("Sara", "Ali", "Withdraw", Date(), BigDecimal(298.0), "KWD", "sara_10"),
        )
    }
}
