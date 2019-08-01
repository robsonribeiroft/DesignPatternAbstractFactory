package com.rrdev.designpatternabstractfactory.factory.textFactory

import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryDisplay
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum.RED

class RedText: AbstractText() {
    override fun displayOnFormat(): FactoryDisplay {
        return FactoryDisplay(RED.accent) {getText().fold(""){ acc, c ->
            "$acc\n$c"
        }}
    }

    override fun getBackgroundColor(): String = RED.color

    override fun getText(): String = RED.color



}