package com.rrdev.designpatternabstractfactory.factory

abstract class AbstractText {

    abstract fun getBackgroundColor(): String

    protected abstract fun getText(): String

    abstract fun displayOnFormat(): FactoryDisplay
}