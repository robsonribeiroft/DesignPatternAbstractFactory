package com.rrdev.designpatternabstractfactory.factory

enum class FactoryEnum(val color: String, val accent: String) {
    RED("#FFC24343", "#FFFFFF"),
    GREEN("#FF97E23F", "#000000"),
    BLUE("#FF00BCD4", "#000000"),
    ORANGE("#FFFF9800", "#FFFFFF"),
    BLACK("#000000", "#FFFFFF")
}