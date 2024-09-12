package com.example.pictureenglishcards.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pictureenglishcards.model.ClassData


@Database(entities = [ClassData::class], version = 2)
abstract class WordsDatabase : RoomDatabase() {
    abstract fun WordsDao(): WordsDao

}


