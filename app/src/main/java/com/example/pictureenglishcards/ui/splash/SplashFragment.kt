package com.example.pictureenglishcards.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pictureenglishcards.R
import com.example.pictureenglishcards.databinding.FragmentSplashBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding
    private val viewModel by viewModels<SplashViewModel>()
    private val scope by lazy { CoroutineScope(Dispatchers.Main) }
      val bottomNavView by lazy {
        requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.addSampleWords()
       bottomNavView.visibility=View.GONE

        scope.launch {
            viewModel.addSampleWords()
            delay(3000)
            val action = SplashFragmentDirections.actionSplashFragmentToFragmentBir()
            findNavController().navigate(action)
            bottomNavView.visibility = View.VISIBLE
        }

    }
}