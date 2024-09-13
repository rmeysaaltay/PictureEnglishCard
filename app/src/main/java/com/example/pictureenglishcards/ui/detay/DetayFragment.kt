package com.example.pictureenglishcards.ui.detay

import android.content.Context
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.example.pictureenglishcards.R
import com.example.pictureenglishcards.databinding.FragmentDetayBinding
import com.example.pictureenglishcards.ui.MyAdapter
import com.example.pictureenglishcards.util.UiState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.Locale

@AndroidEntryPoint
class DetayFragment : Fragment() {
    private val detayViewModel by viewModels<DetayViewModel>()
    private lateinit var binding: FragmentDetayBinding
    val args: DetayFragmentArgs by navArgs()
    val wordId by lazy { args.wordId }
    var learned = false
//    private lateinit var tts: TextToSpeech
//    private lateinit var kelime: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        tts = TextToSpeech(requireContext(), this)
//        val imageView = view.findViewById<ImageView>(R.id.imageView)
//        imageView.setOnClickListener {
//            speak(kelime)
//        }


        detayViewModel.readData(wordId)
        livedataObserver()


        binding.imageButton2.setOnClickListener {
            updateData()
        }

    }

    private fun updateData() {

        detayViewModel.updateData(wordId, !learned)
    }

//    override fun onInit(status: Int) {
//        if (status == TextToSpeech.SUCCESS) {
//
//            val result = tts.setLanguage(Locale("en", "US"))
//
//            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                // Dil desteklenmiyorsa hata ver
//                println("Dil desteklenmiyor.")
//            }
//        } else {
//            println("TextToSpeech motoru başlatılamadı.")
//        }
//    }
//
//    // Kelimeyi okuma fonksiyonu
//    private fun speak(text: String) {
//        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
//        }

    private fun livedataObserver() {
        lifecycleScope.launch {
            detayViewModel._learn.collect { state ->
                when (state) {
                    is UiState.Error -> {}
                    UiState.Loading -> {}
                    is UiState.Success -> {
                        if (learned) {
                            Toast.makeText(requireContext(), "Forgotten", Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(
                                requireContext(),
                                "Learned",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }
                }

            }
        }

        lifecycleScope.launch {
            detayViewModel._data.collect { state ->
                when (state) {
                    is UiState.Error -> {
                        println(state.error.message)
                    }

                    UiState.Loading -> {
                        println("loading")
                    }

                    is UiState.Success -> {
                        with(state) {
                            learned = result.learn
                            binding.kelime.text = result.kelime
                            binding.cumle.text = result.cumle
                            binding.kelimeAnlami.text = result.kelimeAnlami
                            if (result.titleImage != null) {
                                binding.titleImage.setImageResource(
                                    getDrawableIdFromName(
                                        result.titleImage
                                    )
                                )
                            }
                        }
                    }
                }

            }
        }
    }


    private fun getDrawableIdFromName(imageName: String): Int {
        return requireContext().resources.getIdentifier(
            imageName,
            "drawable",
            requireContext().packageName
        )
    }


}