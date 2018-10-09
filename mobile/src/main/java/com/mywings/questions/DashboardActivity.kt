package com.mywings.questions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mywings.questions.ui.dashboard.DashboardFragment

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, DashboardFragment.newInstance())
                    .commitNow()
        }
    }

}
