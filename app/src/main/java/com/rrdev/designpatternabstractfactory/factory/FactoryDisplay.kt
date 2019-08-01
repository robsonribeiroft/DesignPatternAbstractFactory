package com.rrdev.designpatternabstractfactory.factory

data class FactoryDisplay(val textAccentColor: String,
                          val formatText: () -> String)