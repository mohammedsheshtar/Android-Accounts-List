package com.muhammed.accountslist.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.muhammed.accountslist.data.AccountStatements
import com.muhammed.accountslist.ui.theme.CardGrayEven
import com.muhammed.accountslist.ui.theme.CardGrayOdd
import com.muhammed.accountslist.ui.theme.DepositGreen
import com.muhammed.accountslist.ui.theme.WithdrawRed
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
@Composable
fun AccountCard(accountStatement: AccountStatements, index: Int, modifier: Modifier = Modifier) {

    val typeColor = if (accountStatement.transactionType == "Deposit") DepositGreen else WithdrawRed

    Card(
        modifier = Modifier.fillMaxWidth().height(100.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .height(100.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "From: ${accountStatement.from}")
                    Text(text = "To: ${accountStatement.to}")
                }

                Text(
                    text = "Type: ${accountStatement.transactionType}",
                    modifier = Modifier.padding(vertical = 4.dp),
                    color = typeColor
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Amount: ${accountStatement.amount} ${accountStatement.currency}")
                    Text(text = "On: ${SimpleDateFormat("dd/MM/yyyy").format(accountStatement.timeOfTransaction)}")
                }
            }
        }
    }