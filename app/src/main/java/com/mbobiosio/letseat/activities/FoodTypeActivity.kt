package com.mbobiosio.letseat.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.mbobiosio.letseat.R
import com.mbobiosio.letseat.model.Foods
import kotlinx.android.synthetic.main.activity_food_type.*

class FoodTypeActivity : AppCompatActivity() {

    var foodType = Foods("", "", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_type)
    }

    fun breakfastBtn(view: View) {
        lunchBtnClick.isChecked = false
        dinnerBtnClick.isChecked = false

        foodType.food = "breakfast"
    }

    fun lunchBtn(view: View) {
        breakfastBtn.isChecked = false
        dinnerBtnClick.isChecked = false

        foodType.food = "lunch"
    }

    fun dinnerBtn(view: View) {
        breakfastBtn.isChecked = false
        lunchBtnClick.isChecked = false

        foodType.food = "dinner"
    }

    //    fun foodTypeSelect(view: View) {
//        if (foodType.food != "") {
//            val selectFood = Intent(this, DinnerActivity::class.java)
//            //selectFood.putExtra(EXTRA_FOOD, foodType)
//            startActivity(selectFood)
//        } else {
//            Toast.makeText(this, "Please select one", Toast.LENGTH_SHORT).show()
//        }
//    }
    fun foodTypeSelect(view: View) {
        if (foodType.food == "breakfast") {
            val breakfast = Intent(this, BreakFastActivity::class.java)
            startActivity(breakfast)
        }
        else if (foodType.food == "lunch") {
            val lunch = Intent(this, LunchActivity::class.java)
            startActivity(lunch)
        }
        else if (foodType.food == "dinner") {
            val dinner = Intent(this, DinnerActivity::class.java)
            startActivity(dinner)
        } else {
            Toast.makeText(this, "Please make a selection first", Toast.LENGTH_SHORT).show()
        }
    }
}
