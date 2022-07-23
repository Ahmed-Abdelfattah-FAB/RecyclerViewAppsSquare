package com.app.square.recyclerview3

class Item(var name: String, var email: String, var image: Int) {
    companion object {
        fun populate() = listOf<Item>(
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background),
            Item("ahmed", "email@gmail.com", R.drawable.ic_launcher_background)
        )
    }
}