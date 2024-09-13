package com.example.pictureenglishcards.data.repository

import com.example.pictureenglishcards.data.WordsDao
import com.example.pictureenglishcards.model.ClassData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WordRepositoryImpl @Inject constructor(
    private val wordsDao: WordsDao
) : WordRepository {


    override suspend fun addWord(kelime: List<ClassData>): Flow<Unit> = flow {
        emit(wordsDao.addWord(kelime))
    }

    override suspend fun readAllData(): Flow<List<ClassData>> = flow {
        emit(wordsDao.readAllData())

    }

    override suspend fun readData(id: Int): Flow<ClassData> = flow {
        emit(wordsDao.readData(id))
    }

    override suspend fun updateData(id: Int, learn: Int): Flow<Unit> = flow {
        emit(wordsDao.updateData(id, learn))
    }
}