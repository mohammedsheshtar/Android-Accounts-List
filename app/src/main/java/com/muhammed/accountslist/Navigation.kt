package com.muhammed.accountslist

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.muhammed.accountslist.composables.AccountStatementDetails
import com.muhammed.accountslist.composables.ListAccountStatements
import com.muhammed.accountslist.data.AccountStatements
import com.muhammed.accountslist.repositories.AccountRepository

enum class NavRoutesEnum(val value: String) {
    NAV_ROUTE_ACCOUNT_STATEMENTS_LIST("accountStatementList"),
    NAV_ROUTE_ACCOUNT_STATEMENT_DETAILS("accountStatementDetails")
}

@Composable
fun AccountStatementsNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavRoutesEnum.NAV_ROUTE_ACCOUNT_STATEMENTS_LIST.value
) {
    var accountStatementState by remember { mutableStateOf(AccountRepository.getAccountStatements()) }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavRoutesEnum.NAV_ROUTE_ACCOUNT_STATEMENTS_LIST.value) {

            ListAccountStatements(
                accountStatementState,
                modifier = modifier,
                onItemClicked = {
                    navController.navigate("${NavRoutesEnum.NAV_ROUTE_ACCOUNT_STATEMENT_DETAILS.value}/$it")
                }
            )
        }

        composable("${NavRoutesEnum.NAV_ROUTE_ACCOUNT_STATEMENT_DETAILS.value}/{accountName}") {
            val accountName = it.arguments?.getString("accountName")
            AccountStatementDetails(accountStatements = accountStatementState.find { it.accountName == accountName})
        }
    }
}