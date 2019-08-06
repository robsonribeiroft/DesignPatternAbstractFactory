package com.rrdev.designpatternabstractfactory.factory.textFactory

import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryDisplay
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum

class BlackText: AbstractText() {
    override fun getBackgroundColor() = FactoryEnum.BLACK.color

    override fun getText() = FactoryEnum.BLACK.color

    override fun displayOnFormat(): FactoryDisplay {
        return FactoryDisplay(FactoryEnum.BLACK.accent){getText().fold(""){acc, c ->
            "$acc ... $c"
        }}
    }
}