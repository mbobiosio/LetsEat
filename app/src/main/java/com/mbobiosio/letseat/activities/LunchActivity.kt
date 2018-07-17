package com.mbobiosio.letseat.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Toast
import com.mbobiosio.letseat.R
import kotlinx.android.synthetic.main.activity_breakfast.*
import kotlinx.android.synthetic.main.activity_lunch.*
import java.util.*

class LunchActivity : BaseActivity() {

    val foodList = arrayListOf("Ekpang Nkukwo", "Porridge Plantain", "Pounded Yam", "Jollof Rice", "Yam & Egg Sauce", "Rice and Stew", "Plaintain & Chicken", "Coconut Rice", "Fried Rice", "Afang Soup", "Okro Soup", "Meat Pie and Yogurt")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch)

        decideLunchBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selected_lunch_text.text = foodList[randomFood]
        }
        add_lunch.setOnClickListener {
            if (TextUtils.isEmpty(new_lunch_editText.text.toString())) {
                errorToast(getString(R.string.new_food_empty))
            } else {
                val newFood = new_lunch_editText.text.toString()
                foodList.add(newFood)
                new_lunch_editText.text.clear()
            }
        }
    }
}
