package com.kashonkov.avangard_compose.navigation

enum class AvangardScreen {
        Login,
        Main;

        companion object {
                fun fromRoute(route: String?): AvangardScreen =
                        when (route?.substringBefore("/")) {
                                Login.name -> Login
                                Main.name -> Main
                                null -> Login
                                else -> throw IllegalArgumentException("Route $route is not recognized.")
                        }
        }
}