package com.example.pictureenglishcards.data

import androidx.lifecycle.LiveData

class WordRepository(private val wordsDao: WordsDao) {
    val readAllData: LiveData<List<ClassData>> = wordsDao.readAllData()
    suspend fun addWords(words:ClassData){
        wordsDao.addWord(words)
    }

}