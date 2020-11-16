package com.example.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.test.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() =
                MainFragment()
    }

    lateinit var viewModel: MainViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val binding: FragmentMainBinding =
                DataBindingUtil.inflate(
                        inflater,
                        R.layout.fragment_main, container, false
                )
        binding.lifecycleOwner = this
        viewModel = MainViewModel()
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.onViewCreated()
    }

}
