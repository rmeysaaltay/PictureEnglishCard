package com.example.pictureenglishcards.data.repository

import androidx.lifecycle.LiveData
import com.example.pictureenglishcards.model.ClassData
import com.example.pictureenglishcards.data.WordsDao
import kotlinx.coroutines.flow.Flow

interface WordRepository {
    suspend fun addWord(kelime: List<ClassData>): Flow<Unit>

    suspend fun readAllData(): Flow<List<ClassData>>

    suspend fun readData(id: Int): Flow<ClassData>

    suspend fun updateData(id: Int, learn: Int): Flow<Unit>
}