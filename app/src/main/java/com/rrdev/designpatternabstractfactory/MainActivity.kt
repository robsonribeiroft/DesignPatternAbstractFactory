package com.rrdev.designpatternabstractfactory

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rrdev.designpatternabstractfactory.factory.AbstractFactory
import com.rrdev.designpatternabstractfactory.factory.AbstractText
import com.rrdev.designpatternabstractfactory.factory.FactoryEnum
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myList = mutableListOf<FactoryEnum>()
    private var currentFactory: AbstractText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_action.setOnClickListener {
            if (myList.isEmpty()){
                myList.addAll(AbstractFactory.retrieveList())
            }
            val colorText = myList.removeAt(0)
            currentFactory = AbstractFactory.getTextFactory(colorText)
            currentFactory?.let { fillBackground(it) }
        }

        btn_show.setOnClickListener {
            currentFactory?.let {
                textView.apply {
                    setTextColor(Color.parseColor(it.displayOnFormat().textAccentColor))
                    text = it.displayOnFormat().formatText()
                }
            }
        }
    }

    private fun fillBackground(abstractText: AbstractText){
        textView.text = ""
        containerLayout.setBackgroundColor(Color.parseColor(abstractText.getBackgroundColor()))
    }
}
