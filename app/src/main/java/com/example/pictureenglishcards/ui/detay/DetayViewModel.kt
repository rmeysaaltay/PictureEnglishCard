package com.example.pictureenglishcards.ui.detay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pictureenglishcards.data.repository.WordRepository
import com.example.pictureenglishcards.model.ClassData
import com.example.pictureenglishcards.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetayViewModel @Inject constructor(
    private val repository: WordRepository
) : ViewModel() {
    private val data = MutableStateFlow<UiState<ClassData>>(UiState.Loading)
    val _data get() = data.asStateFlow()
    fun readData(id: Int) = viewModelScope.launch {

        repository.readData(id)
            .onStart {
                data.emit(UiState.Loading)
            }
            .catch {
                data.emit(UiState.Error(it))
            }
            .collect {
                println(it)
                data.emit(UiState.Success(it))
            }
    }

}