package com.mywings.questions.ui.questionsetdashboard

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.questions.RegistrationActivity
import com.mywings.questions.databinding.QuestionSetDashboardFragmentBinding

class QuestionSetDashboardFragment : Fragment() {

    companion object {
        fun newInstance() = QuestionSetDashboardFragment()
    }

    private lateinit var viewModel: QuestionSetDashboardViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = QuestionSetDashboardFragmentBinding.inflate(inflater, container, false)
        binding.signUpListener = signUpListener
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(QuestionSetDashboardViewModel::class.java)
    }

    val signUpListener = View.OnClickListener {
        val intent = Intent(context, RegistrationActivity::class.java)
        startActivity(intent)
    }
}
