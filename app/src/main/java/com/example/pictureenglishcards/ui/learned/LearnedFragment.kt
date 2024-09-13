package com.example.pictureenglishcards.ui.learned

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pictureenglishcards.R
import com.example.pictureenglishcards.databinding.FragmentLearnedBinding
import com.example.pictureenglishcards.databinding.FragmentWordviewBinding
import com.example.pictureenglishcards.ui.MyAdapter
import com.example.pictureenglishcards.ui.word.WordViewFragmentDirections
import com.example.pictureenglishcards.ui.word.WordViewModel
import com.example.pictureenglishcards.util.UiState
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LearnedFragment : Fragment() {
    private lateinit var binding: FragmentLearnedBinding
    private val adapter by lazy { MyAdapter(arrayListOf(), ::onItemClick) }
    private val viewModel by viewModels<LearnedViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLearnedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        livedataObserver()
        viewModel.readAllData()

    }

    private fun livedataObserver() {
        lifecycleScope.launchWhenStarted {
            viewModel._wordList.collect { state ->
                when (state) {
                    is UiState.Error -> {
                        println(state.error.message)
                    }

                    UiState.Loading -> {
                        println("loading")
                    }

                    is UiState.Success -> {
                        adapter.update(state.result)
                    }
                }
            }
        }
    }

    private fun onItemClick(id: Int) {
        val action = LearnedFragmentDirections.actionLearnedFragmentToDetayFragment(id)
        findNavController().navigate(action)

    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }
}
