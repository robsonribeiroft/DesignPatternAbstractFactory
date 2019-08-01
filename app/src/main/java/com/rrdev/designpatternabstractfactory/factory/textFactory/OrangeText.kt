package com.rrdev.designpatternabstractfactory.factory.textFactory

import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryDisplay
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum.ORANGE

class OrangeText: AbstractText() {
    override fun displayOnFormat(): FactoryDisplay {
        return FactoryDisplay(ORANGE.accent) {getText().fold(""){ acc, c ->
            "$acc\n$c"
        }}
    }

    override fun getBackgroundColor(): String = ORANGE.color

    override fun getText(): String = ORANGE.color



}