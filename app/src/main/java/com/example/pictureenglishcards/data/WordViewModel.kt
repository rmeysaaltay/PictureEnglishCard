package com.example.pictureenglishcards.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val readAllData: LiveData<List<ClassData>>
    private val repository: WordRepository

    init {
        val WordsDao = WordsDatabase.getDatabase(application).WordsDao()
        repository = WordRepository(wordsDao = WordsDao)

        readAllData = repository.readAllData
    }

    suspend fun addWords(words: ClassData) {
        viewModelScope.launch(Dispatchers.IO) { }
        repository.addWords(words)

    }

}