package com.example.pictureenglishcards.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "words")
data class ClassData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val titleImage: Int,
    val kelime: String,
    val kelimeAnlami: String,
    val cumle: String
) {

}


