package com.muhammed.accountslist.composables

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp
import com.muhammed.accountslist.data.AccountStatements
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
@Composable
fun AccountStatementDetails(
    modifier: Modifier = Modifier,
    accountStatements: AccountStatements?
) {
    Card(
        modifier = Modifier.fillMaxWidth().height(100.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),

    ){
        Column(
            modifier = modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "account name: ${accountStatements?.accountName}")
            Text(text = "Time of transaction:")
            Text(
                text = ": ${
                    accountStatements?.timeOfTransaction?.let {
                        SimpleDateFormat("dd/MM/yyyy - HH:mm:ss z").format(
                            it
                        )
                    }
                }"
            )
        }
    }
}