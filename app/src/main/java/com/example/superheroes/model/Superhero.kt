package com.example.superheroes.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Superhero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val desc: Int,
    @StringRes val vuln: Int,
    @StringRes val vulnDesc : Int,
)
