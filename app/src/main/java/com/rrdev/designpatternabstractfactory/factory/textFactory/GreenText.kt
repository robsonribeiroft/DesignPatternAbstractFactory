package com.rrdev.designpatternabstractfactory.factory.textFactory

import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryDisplay
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum.GREEN

class GreenText: AbstractText() {
    override fun displayOnFormat(): FactoryDisplay {
        return FactoryDisplay(GREEN.accent) {getText().fold(""){ acc, c ->
            "$acc$c"
        }}
    }

    override fun getBackgroundColor(): String = GREEN.color

    override fun getText(): String = GREEN.color



}