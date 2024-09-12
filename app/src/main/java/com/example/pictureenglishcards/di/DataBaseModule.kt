package com.example.pictureenglishcards.di

import android.content.Context
import androidx.room.Room
import com.example.pictureenglishcards.data.WordsDao
import com.example.pictureenglishcards.data.WordsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DataBaseModule {

    @Provides
    @ViewModelScoped
    fun provideDao(wordsDatabase: WordsDatabase): WordsDao {
        return wordsDatabase.WordsDao()
    }

    @Provides
    @ViewModelScoped
    fun provideDataBase(@ApplicationContext context: Context): WordsDatabase {
        val db = Room.databaseBuilder(
            context.applicationContext,
            WordsDatabase::class.java,
            "words"
        ).fallbackToDestructiveMigration().build()

        return db
    }

}