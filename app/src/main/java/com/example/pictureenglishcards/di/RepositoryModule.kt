package com.example.pictureenglishcards.di

import com.example.pictureenglishcards.data.repository.WordRepository
import com.example.pictureenglishcards.data.repository.WordRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    @ViewModelScoped
    fun bindWordRepository(wordRepositoryImpl: WordRepositoryImpl):WordRepository

}