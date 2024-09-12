package com.example.pictureenglishcards.ui.word

import androidx.lifecycle.MutableLiveData
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
class WordViewModel @Inject constructor(
    private val repository: WordRepository
) : ViewModel() {
    private val wordList = MutableStateFlow<UiState<List<ClassData>>>(UiState.Loading)
    val _wordList get() = wordList.asStateFlow()

    fun readAllData() = viewModelScope.launch {
        repository.readAllData().onStart {
            wordList.emit(UiState.Loading)
        }.catch { wordList.emit(UiState.Error(it)) }
            .collect {
            wordList.emit(UiState.Success(it))
        }
    }
}

