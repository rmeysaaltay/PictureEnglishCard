package com.example.pictureenglishcards.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ClassData::class], version = 1, exportSchema = false)
abstract class WordsDatabase : RoomDatabase() {
    abstract fun WordsDao(): WordsDao

    companion object {
        @Volatile
        private var INSTANCE: WordsDatabase? = null

        fun getDatabase(context: Context): WordsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordsDatabase::class.java,
                    "words_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }


}