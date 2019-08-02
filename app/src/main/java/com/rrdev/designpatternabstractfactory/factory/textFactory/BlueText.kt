package com.rrdev.designpatternabstractfactory.factory.textFactory

import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryDisplay
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum.BLUE

class BlueText: AbstractText() {
    override fun displayOnFormat(): FactoryDisplay {
        return FactoryDisplay(BLUE.accent) {getText().fold(""){ acc, c ->
            "$acc\n${"\t".repeat(acc.length/2)}$c"
        }}
    }

    override fun getBackgroundColor(): String = BLUE.color

    override fun getText(): String = BLUE.color



}