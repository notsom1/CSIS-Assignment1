//CSIS401 Assignment1
//Ahmad Aldulaie S00052749
package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    val costOf4x6 = 0.19
    val costOf5x7 = 0.49
    val costOf8x10 = 0.79
    var totalCost = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onOrderButton(v: View)
    {
        var numberOfPrints = 0

        if (!et_NumberOfPrints.text.isEmpty())
            numberOfPrints = et_NumberOfPrints.text.toString().toInt()
        val radioButton = radioGroup.checkedRadioButtonId
        if (radioButton == rb_4x6.id)
        {
            totalCost = numberOfPrints * costOf4x6
        }

        else if (radioButton == rb_5x7.id)
        {
            totalCost = numberOfPrints * costOf5x7
        }

        else if (radioButton == rb_8x10.id)
        {
            totalCost = numberOfPrints * costOf8x10
        }
        val msg = NumberFormat.getCurrencyInstance().format(totalCost)
        tv_Cost.text = "The order cost is $msg"
    }
}