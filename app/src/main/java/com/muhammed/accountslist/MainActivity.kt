package com.muhammed.accountslist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muhammed.accountslist.composables.AccountCard
import com.muhammed.accountslist.data.AccountStatements
import com.muhammed.accountslist.repositories.AccountRepository
import com.muhammed.accountslist.ui.theme.AccountsListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AccountsListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AccountStatementsNavHost(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}