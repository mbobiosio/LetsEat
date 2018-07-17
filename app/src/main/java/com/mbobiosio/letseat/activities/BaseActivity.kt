package com.mbobiosio.letseat.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import es.dmoral.toasty.Toasty

/**
 * Created by Mbuodile Obiosio on 7/17/18
 * cazewonder@gmail.com
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun successToast(string: String) {
        Toasty.success(this, string).show()
    }

    fun errorToast(string: String) {
        Toasty.error(this, string).show()
    }
}
