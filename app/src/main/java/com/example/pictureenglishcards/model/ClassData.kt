package com.example.pictureenglishcards.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "words", indices = [Index(value = ["kelime"], unique = true)])
data class ClassData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val titleImage: String?,
    val kelime: String,
    val kelimeAnlami: String,
    val cumle: String,
    val learn: Boolean=false
) {

}



