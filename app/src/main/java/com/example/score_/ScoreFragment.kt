package com.example.score_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.score_.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {
    private val viewModel: ScoreFragment by viewModels()

private lateinit var binding: FragmentScoreBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?) :View {
        binding = FragmentScoreBinding.inflate(inflater, container, false)
return binding.root
          }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.Add.setOnClickListener {
            viewModel.AddOne()
            updateprint()

        }
        binding.subtract.setOnClickListener {
            viewModel.LessTow()
            updateprint()
        }
        binding.addextra.setOnClickListener {
            viewModel.AddFour()
            updateprint()
        }

        updateprint()
        binding.print.text="secore (0)"
        binding.subtract.setOnClickListener {  }
    }

    private fun updateprint() {
        binding?.print.text=viewModel.reslut.toString

    }

    override fun onDetach() {
        super.onDetach()
    }
}

