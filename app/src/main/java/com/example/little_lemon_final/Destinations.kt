package com.example.little_lemon_final

interface Destinations {
    val route: String
}

object Home : Destinations {
    override val route = "Home"
}
object Onboarding : Destinations {
    override val route = "Onboarding"
}
object Profile : Destinations {
    override val route = "Profile"
}