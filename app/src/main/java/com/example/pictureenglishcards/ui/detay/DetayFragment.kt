package com.example.pictureenglishcards.ui.detay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.example.pictureenglishcards.databinding.FragmentDetayBinding
import com.example.pictureenglishcards.ui.MyAdapter
import com.example.pictureenglishcards.util.UiState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class DetayFragment : Fragment() {
    private val detayViewModel by viewModels<DetayViewModel>()
    // private val adapter by lazy { MyAdapter(arrayListOf(),::onItemClick) }
    private lateinit var binding: FragmentDetayBinding
    val args: DetayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wordId = args.wordId
        detayViewModel.readData(wordId)
        livedataObserver()
    }

    private fun livedataObserver() {
        lifecycleScope.launchWhenStarted {
            detayViewModel._data.collect { state ->
                when (state) {
                    is UiState.Error -> {
                        println(state.error.message)
                    }

                    UiState.Loading -> {
                        println("loading")
                    }

                    is UiState.Success -> {
                      with(state){
                          binding.kelime.text=result.kelime
                          binding.cumle.text=result.cumle
                          binding.kelimeAnlami.text=result.kelimeAnlami
                          if (result.titleImage!=null){
                          binding.titleImage.setImageResource(result.titleImage)

                      }
                      }
                    }
                }

            }
        }
    }

}