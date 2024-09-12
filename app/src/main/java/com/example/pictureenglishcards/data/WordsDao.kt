package com.example.pictureenglishcards.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pictureenglishcards.model.ClassData


@Dao
interface WordsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addWord(kelime: List<ClassData>)

    @Query("SELECT * FROM words")
    suspend fun readAllData(): List<ClassData>


}