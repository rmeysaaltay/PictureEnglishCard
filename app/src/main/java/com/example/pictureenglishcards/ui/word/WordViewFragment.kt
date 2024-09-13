package com.example.pictureenglishcards.ui.word

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pictureenglishcards.databinding.FragmentWordviewBinding
import com.example.pictureenglishcards.ui.MyAdapter
import com.example.pictureenglishcards.util.UiState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordViewFragment : Fragment() {

    private lateinit var binding: FragmentWordviewBinding
    private val adapter by lazy { MyAdapter(arrayListOf(),::onItemClick) }
    private val viewModel by viewModels<WordViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWordviewBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.readAllData()
        setupRecyclerView()
        livedataObserver()
        setupSwipeRefreshLayout()


    }

    private fun livedataObserver() {
        lifecycleScope.launchWhenStarted {
            viewModel._wordList.collect { state ->
                when (state) {
                    is UiState.Error -> {
                        println(state.error.message)
                        binding.swiperefresh.isRefreshing=false
                    }

                    UiState.Loading -> {
                        println("loading")
                    }

                    is UiState.Success -> {
                        adapter.update(state.result)
                        binding.swiperefresh.isRefreshing=false
                    }
                }
            }
        }
    }

    private fun onItemClick(id: Int){
        val action= WordViewFragmentDirections.actionFragmentBirToDetayFragment(wordId =id)
        findNavController().navigate(action)

    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }
    private fun setupSwipeRefreshLayout() {
        binding.swiperefresh.setOnRefreshListener {
            viewModel.readAllData()
            binding.swiperefresh.isRefreshing=false
        }
    }

}