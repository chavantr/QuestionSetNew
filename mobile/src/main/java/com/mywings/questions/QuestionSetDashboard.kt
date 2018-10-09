package com.mywings.questions

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mywings.questions.databinding.QuestionSetDashboardActivityBinding
import com.mywings.questions.ui.questionsetdashboard.QuestionSetDashboardFragment

class QuestionSetDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :QuestionSetDashboardActivityBinding =  DataBindingUtil.setContentView(this,R.layout.question_set_dashboard_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, QuestionSetDashboardFragment.newInstance())
                    .commitNow()
        }
    }
}
