package com.example.pictureenglishcards.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val readAllData: LiveData<List<ClassData>>
    private val repository: WordRepository

    init {
        val WordsDao = WordsDatabase.getDatabase(application).WordsDao()
        repository = WordRepository(wordsDao = WordsDao)

        readAllData = repository.readAllData
    }

//    suspend fun addWords(words: ClassData) {
//        viewModelScope.launch(Dispatchers.IO) { }
//        repository.addWords(words)
//
//    }
    fun addSampleWords() {
       /* viewModelScope.launch(Dispatchers.IO) {
            val wordsList = listOf(
                //ClassData(titleImage = R.drawable.sample1, kelime = "big", kelimeAnlami = "Büyük", cumle = "What a big house!"),
                //ClassData(titleImage = R.drawable.sample2, kelime = "bad", kelimeAnlami = "Kötü", cumle = "A bad smell!"),
               //ClassData(kelime="happy", kelimeAnlami="mutlu", cumle="I am very happy because of you.")
                //ClassData(kelime="cold",kelimeAnlami="soğuk",cumle="")
                 //ClassData(kelime="new",kelimeAnlami="yeni",cumle="")
              //  ClassData(kelime="sad",kelimeAnlami="üzgün",cumle="")
                //  ClassData(kelime="have",kelimeAnlami="sahip olmak",cumle="")
                //  ClassData(kelime="do",kelimeAnlami="yapmak",cumle="")
                //  ClassData(kelime="go",kelimeAnlami="gitmek",cumle="")
                //  ClassData(kelime="see",kelimeAnlami="görmek",cumle="")
                //  ClassData(kelime="eat",kelimeAnlami="yemek",cumle="")
                //  ClassData(kelime="read",kelimeAnlami="okumak",cumle="")
                //  ClassData(kelime="play",kelimeAnlami="oynamak",cumle="")
                //  ClassData(kelime="drink",kelimeAnlami="içmek",cumle="")
                //  ClassData(kelime="difficult",kelimeAnlami="zor",cumle="")
                //  ClassData(kelime="different",kelimeAnlami="farklı",cumle="")
                //  ClassData(kelime="comfortable",kelimeAnlami="rahat",cumle="")
                //  ClassData(kelime="quiet",kelimeAnlami="sessiz",cumle="")
                //  ClassData(kelime="cheap",kelimeAnlami="ucuz",cumle="")
                //  ClassData(kelime="want",kelimeAnlami="istemek",cumle="")
                //  ClassData(kelime="need",kelimeAnlami="ihtiyaç duymak",cumle="")
                //  ClassData(kelime="try",kelimeAnlami="denemek",cumle="")
                //  ClassData(kelime="know",kelimeAnlami="bilmek",cumle="")
                //  ClassData(kelime="find",kelimeAnlami="bulmak",cumle="")
                //  ClassData(kelime="important",kelimeAnlami="önemli",cumle="")
                //  ClassData(kelime="useful",kelimeAnlami="kullanışlı",cumle="")
                //  ClassData(kelime="efficient",kelimeAnlami="verimli",cumle="")
                //  ClassData(kelime="reliable",kelimeAnlami="güvenilir",cumle="")
                //  ClassData(kelime="unusual",kelimeAnlami="alışılmadık",cumle="")
                //  ClassData(kelime="dangerous",kelimeAnlami="tehlikeli",cumle="")
                //  ClassData(kelime="familiar",kelimeAnlami="tanıdık",cumle="")
                //  ClassData(kelime="decide",kelimeAnlami="karar vermek",cumle="")
                //  ClassData(kelime="argue",kelimeAnlami="tartışmak",cumle="")
                //  ClassData(kelime="explore",kelimeAnlami="keşfetmek",cumle="")
                //  ClassData(kelime="develop",kelimeAnlami="geliştirmek",cumle="")
                //  ClassData(kelime="manage",kelimeAnlami="yönetmek",cumle="")
                //  ClassData(kelime="significant",kelimeAnlami="önemli",cumle="")
                //  ClassData(kelime="complex",kelimeAnlami="karmaşık",cumle="")
                //  ClassData(kelime="accurate",kelimeAnlami="doğru",cumle="")
                //  ClassData(kelime="effective",kelimeAnlami="etkili",cumle="")
                //  ClassData(kelime="reasonable",kelimeAnlami="makul",cumle="")
                //  ClassData(kelime="achieve",kelimeAnlami="başarmak",cumle="")
                //  ClassData(kelime="demonstrate",kelimeAnlami="göstermek",cumle="")
                //  ClassData(kelime="implement",kelimeAnlami="uygulamak",cumle="")
                //  ClassData(kelime="analyze",kelimeAnlami="analiz etmek",cumle="")
                //  ClassData(kelime="assess",kelimeAnlami="değerlendirmek",cumle="")
              //ClassData(kelime ="come" , kelimeAnlami ="gelmek" , cumle = "")
             //ClassData(kelime = "say", kelimeAnlami = "söylemek", cumle = "")
            //ClassData(kelime = "exciting ", kelimeAnlami = "heycan verici", cumle ="" )
            //ClassData(kelime = "improve", kelimeAnlami = "geliştirmek", cumle ="" )
            //ClassData(kelime = ""fast, kelimeAnlami = "hızlı", cumle ="" )


            )
            wordsList.forEach { repository.addWords(it) }
        }*/
    }

}