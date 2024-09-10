package com.example.pictureenglishcards.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface WordsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
suspend fun addWord(kelime: ClassData)

@Query("SELECT*FROM words ORDER BY id ASC")
fun readAllData():LiveData<List<ClassData>>


}