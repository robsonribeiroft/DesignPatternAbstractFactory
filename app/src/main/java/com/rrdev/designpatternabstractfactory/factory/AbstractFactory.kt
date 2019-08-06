package com.rrdev.designpatternabstractfactory.factory

import com.rrdev.designpatternabstractfactory.factory.textFactory.*

object AbstractFactory {

    fun getTextFactory(enum: FactoryEnum): AbstractText{
        return when(enum){
            FactoryEnum.RED -> RedText()
            FactoryEnum.BLUE -> BlueText()
            FactoryEnum.GREEN -> GreenText()
            FactoryEnum.BLACK -> BlackText()
            else -> OrangeText()
        }
    }


    fun retrieveList() = mutableListOf(FactoryEnum.ORANGE, FactoryEnum.RED, FactoryEnum.BLUE, FactoryEnum.GREEN, FactoryEnum.BLACK)

}