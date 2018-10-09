package com.mywings.questions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mywings.questions.ui.registration.RegistrationFragment

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RegistrationFragment.newInstance())
                    .commitNow()
        }
    }

}
