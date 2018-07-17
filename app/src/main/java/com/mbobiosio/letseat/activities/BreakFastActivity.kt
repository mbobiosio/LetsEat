package com.mbobiosio.letseat.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Toast
import com.mbobiosio.letseat.R
import kotlinx.android.synthetic.main.activity_breakfast.*
import java.util.*

class BreakFastActivity : BaseActivity() {


    val foodList = arrayListOf("Pankcake, Fried Eggs with Orange juice", "Porridge Plantain", "Jollof Rice", "Uhmmm, let's pick the third option from here", "Yam & Egg Sauce", "Rice and Sauce", "Coconut Rice", "Fried Rice")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)

        add_breakfast.setOnClickListener {
            if (TextUtils.isEmpty(new_breakfast_editText.text.toString())) {
                errorToast(getString(R.string.new_food_empty))
            } else {
                val newFood = new_breakfast_editText.text.toString()
                foodList.add(newFood)
                new_breakfast_editText.text.clear()
            }
        }

        decideBreakfastBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selected_breakfast_text.text = foodList[randomFood]
        }
    }
}
