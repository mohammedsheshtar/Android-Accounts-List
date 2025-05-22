package com.muhammed.accountslist.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muhammed.accountslist.data.AccountStatements

@Composable
fun ListAccountStatements(
    accountStatements: List<AccountStatements>,
    modifier: Modifier = Modifier,
    onItemClicked: (String) -> Unit = {}
) {

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(accountStatements) {
            AccountCard(
                accountStatement = it,
                onCardClicked = onItemClicked)
        }
    }
}