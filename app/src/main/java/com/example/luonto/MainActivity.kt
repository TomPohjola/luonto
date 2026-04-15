package com.example.luonto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.luonto.ui.navigation.LuontopeliBottomBar
import com.example.luonto.ui.navigation.LuontopeliNavHost
import com.example.luonto.ui.theme.LuontoTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            LuontoTheme {
                LuontopeliApp()
            }
        }
    }
}

@Composable
fun LuontopeliApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            LuontopeliBottomBar(navController = navController)
        }
    ) { innerPadding ->
        LuontopeliNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}
