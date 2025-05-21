package com.muhammed.accountslist.data

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.Date

data class AccountStatements
    (val from: String,
     val to: String,
     val transactionType: String,
     val timeOfTransaction: Date = Date(),
     val amount: BigDecimal,
     val currency: String)
