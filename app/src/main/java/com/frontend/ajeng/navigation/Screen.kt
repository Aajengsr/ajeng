package com.frontend.ajeng.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Penawaran: Screen("penawaran")
    data object About: Screen("saya")
    data object Detail: Screen("detail_wisata")
}