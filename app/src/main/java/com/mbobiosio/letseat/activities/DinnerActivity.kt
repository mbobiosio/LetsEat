package com.mbobiosio.letseat.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Toast
import com.mbobiosio.letseat.R
import kotlinx.android.synthetic.main.activity_dinner.*
import java.util.*

class DinnerActivity : BaseActivity() {

    val foodList = arrayListOf("Ekpang Nkukwo", "Porridge Plantain", "Jollof Rice", "Lol, i'll take the next pick", "Yam & Egg Sauce", "Rice and Sauce", "Plaintain & Chicken", "Coconut Rice", "Fried Rice", "Afang Soup", "Okro Soup", "Meat Pie and Yogurt")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner)

        decideDinnerBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selected_dinner_text.text = foodList[randomFood]
        }

        add_dinner.setOnClickListener {
            if (TextUtils.isEmpty(new_dinner_editText.text.toString())) {
                errorToast(getString(R.string.new_food_empty))
            } else {
                val newFood = new_dinner_editText.text.toString()
                foodList.add(newFood)
                new_dinner_editText.text.clear()
            }
        }
    }
}
