package com.example.craftopia_master

import com.example.craftopia_master.retrofit.dailyneeds.Dailyneed
import com.example.craftopia_master.retrofit.Fashion.Fashion
import com.example.craftopia_master.retrofit.furniture.Furniture
import com.example.craftopia_master.retrofit.Homedecor.Homedecor
import com.example.craftopia_master.retrofit.kitchen.Kitchen
import com.example.craftopia_master.retrofit.Stationery.Stationery
import com.example.craftopia_master.retrofit.Toy.Toysandgame

data class responseDataClass(
    val dailyneeds: List<Dailyneed>,
    val fashion: List<Fashion>,
    val furniture: List<Furniture>,
    val homedecor: List<Homedecor>,
    val kitchen: List<Kitchen>,
    val stationery: List<Stationery>,
    val toysandgames: List<Toysandgame>
)