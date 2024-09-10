package com.example.pictureenglishcards.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.pictureenglishcards.R
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

    private fun ClassData(kelime: String, kelimeAnlami: String, cumle: String) {

    }

    //    suspend fun addWords(words: ClassData) {
//        viewModelScope.launch(Dispatchers.IO) { }
//        repository.addWords(words)
//
//    }
    fun addSampleWords() {
        viewModelScope.launch(Dispatchers.IO) {
            val wordsList = listOf(
                ClassData(
                    titleImage = R.raw.big,
                    kelime = "big",
                    kelimeAnlami = "Büyük",
                    cumle = "What a big house!"
                ),
                ClassData(
                    titleImage = R.raw.bad,
                    kelime = "bad",
                    kelimeAnlami = "Kötü",
                    cumle = "A bad smell!"
                ),
                ClassData(
                    kelime = "happy",
                    kelimeAnlami = "mutlu",
                    cumle = "I am very happy because of you."
                ),
                ClassData(kelime = "cold", kelimeAnlami = "soğuk", cumle = "This room is cold."),
                ClassData(
                    titleImage = R.raw.cheap,
                    kelime = "new",
                    kelimeAnlami = "yeni",
                    cumle = "I love my new jacket."
                ),
                ClassData(
                    titleImage = R.raw.bad,
                    kelime = "sad",
                    kelimeAnlami = "üzgün",
                    cumle = "This food smells so bad."
                ),
                ClassData(
                    titleImage = R.raw.have,
                    kelime = "have",
                    kelimeAnlami = "sahip olmak",
                    cumle = "I'm so rich when I have you."
                ),
                ClassData(
                    kelime = "do",
                    kelimeAnlami = "yapmak",
                    cumle = "He does so much thing for me."
                ),
                ClassData(
                    titleImage = R.raw.go,
                    kelime = "go",
                    kelimeAnlami = "gitmek",
                    cumle = "Go and don't come back."
                ),
                ClassData(
                    titleImage = R.raw.see,
                    kelime = "see",
                    kelimeAnlami = "görmek",
                    cumle = "When i see u i feel like my heart is going to exoplode"
                ),
                ClassData(kelime = "eat", kelimeAnlami = "yemek", cumle = "I love to eat!"),

                ClassData(
                    kelime = "read",
                    kelimeAnlami = "okumak",
                    cumle = "I read Harry Potter again."
                ),
                ClassData(
                    titleImage = R.raw.have,
                    kelime = "play",
                    kelimeAnlami = "oynamak",
                    cumle = "I don't like play LOL"
                ),
                ClassData(kelime = "drink", kelimeAnlami = "içmek", cumle = "let's some drink."),
                ClassData(kelime = "difficult", kelimeAnlami = "zor", cumle = ""),
                ClassData(
                    titleImage = R.raw.go,
                    kelime = "different",
                    kelimeAnlami = "farklı",
                    cumle = "You are different."
                ),
                ClassData(
                    kelime = "comfortable",
                    kelimeAnlami = "rahat",
                    cumle = "This bed is very comfortable."
                ),
                ClassData(
                    titleImage = R.raw.cheap,
                    kelime = "quiet",
                    kelimeAnlami = "sessiz",
                    cumle = "Be quiet, I'm trying to understand.."
                ),
                ClassData(
                    titleImage = R.raw.cheap,
                    kelime = "cheap",
                    kelimeAnlami = "ucuz",
                    cumle = "My new jacket is very cheap."
                ),
                ClassData(kelime = "want", kelimeAnlami = "istemek", cumle = "I want it."),
                ClassData(
                    titleImage = R.raw.cheap,
                    kelime = "need",
                    kelimeAnlami = "ihtiyaç duymak",
                    cumle = "I need to hug you."
                ),
                ClassData(kelime = "try", kelimeAnlami = "denemek", cumle = "let's try again!"),
                ClassData(kelime = "know", kelimeAnlami = "bilmek", cumle = "He know mw!"),
                ClassData(
                    titleImage = R.raw.bulmak,
                    kelime = "find",
                    kelimeAnlami = "bulmak",
                    cumle = "I found my pen."
                ),

                ClassData(
                    kelime = "important",
                    kelimeAnlami = "önemli",
                    cumle = "This point is important."
                ),
                ClassData(
                    titleImage = R.raw.cheap,
                    kelime = "useful",
                    kelimeAnlami = "kullanışlı",
                    cumle = "Learning a second language can be extremely useful for traveling and career opportunities."
                ),
                ClassData(
                    kelime = "efficient",
                    kelimeAnlami = "verimli",
                    cumle = "The new software update made the system more efficient, reducing processing time by half."
                ),
                ClassData(
                    kelime = "reliable",
                    kelimeAnlami = "güvenilir",
                    cumle = "Choosing a reliable car ensures fewer breakdowns and less maintenance hassle over the years"
                ),
                ClassData(
                    titleImage = R.raw.go,
                    kelime = "unusual",
                    kelimeAnlami = "alışılmadık",
                    cumle = "Her approach to problem-solving was unusual but highly effective."
                ),
                ClassData(
                    kelime = "dangerous",
                    kelimeAnlami = "tehlikeli",
                    cumle = "it's dangerous there."
                ),
                ClassData(
                    kelime = "familiar",
                    kelimeAnlami = "tanıdık",
                    cumle = "The layout of the new office was familiar, making it easy for employees to adapt quickly."
                ),
                ClassData(
                    kelime = "decide",
                    kelimeAnlami = "karar vermek",
                    cumle = "I decide, you will go."
                ),
                ClassData(
                    titleImage = R.raw.idk5,
                    kelime = "argue",
                    kelimeAnlami = "tartışmak",
                    cumle = "During the meeting, they began to argue over the best strategy for the project."
                ),
                ClassData(
                    titleImage = R.raw.explore,
                    kelime = "explore",
                    kelimeAnlami = "keşfetmek",
                    cumle = "Traveling to new countries allows you to explore different cultures and cuisines."
                ),
                ClassData(
                    titleImage = R.raw.have,
                    kelime = "develop",
                    kelimeAnlami = "geliştirmek",
                    cumle = "She plans to develop her skills by taking additional courses and attending workshops."
                ),
                ClassData(
                    kelime = "manage",
                    kelimeAnlami = "yönetmek",
                    cumle = "He was able to manage the team effectively, ensuring all deadlines were met."
                ),
                ClassData(
                    kelime = "significant",
                    kelimeAnlami = "önemli",
                    cumle = "The research found a significant correlation between daily exercise and improved mental health."
                ),
                ClassData(
                    kelime = "complex",
                    kelimeAnlami = "karmaşık",
                    cumle = "The instructions were too complex, making it difficult to assemble the furniture correctly."
                ),
                ClassData(
                    kelime = "accurate",
                    kelimeAnlami = "doğru",
                    cumle = "The scientist ensured that the measurements were accurate to maintain the integrity of the experiment."
                ),
                ClassData(
                    kelime = "effective",
                    kelimeAnlami = "etkili",
                    cumle = "Her new study routine proved to be highly effective in boosting her exam scores."
                ),
                ClassData(
                    kelime = "reasonable",
                    kelimeAnlami = "makul",
                    cumle = "The manager proposed a reasonable deadline for the project, allowing enough time for thorough work without causing undue stress."
                ),
                ClassData(
                    titleImage = R.raw.have,
                    kelime = "achieve",
                    kelimeAnlami = "başarmak",
                    cumle = "With dedication and hard work, you can achieve your long-term goals."
                ),
                ClassData(
                    titleImage = R.raw.idk1,
                    kelime = "demonstrate",
                    kelimeAnlami = "göstermek",
                    cumle = ""
                ),
                ClassData(
                    kelime = "implement",
                    kelimeAnlami = "uygulamak",
                    cumle = "The professor used experiments to demonstrate the principles of physics clearly to the students."
                ),
                ClassData(
                    kelime = "analyze",
                    kelimeAnlami = "analiz etmek",
                    cumle = "The company plans to implement new software to improve workflow efficiency."
                ),
                ClassData(
                    titleImage = R.raw.idk5,
                    kelime = "assess",
                    kelimeAnlami = "değerlendirmek",
                    cumle = "The team will assess the project's progress to ensure it meets the set objectives."
                ),
                ClassData(
                    titleImage = R.raw.fast,
                    kelime = "come",
                    kelimeAnlami = "gelmek",
                    cumle = "Come back."
                ),
                ClassData(
                    kelime = "say",
                    kelimeAnlami = "söylemek",
                    cumle = "I want say something."
                ),
                ClassData(
                    titleImage = R.raw.have,
                    kelime = "exciting ",
                    kelimeAnlami = "heycan verici",
                    cumle = "Oh my god, this is so exciting!"
                ),
                ClassData(
                    kelime = "improve",
                    kelimeAnlami = "geliştirmek",
                    cumle = "Regular exercise can significantly improve your overall health and well-being."
                ),
                ClassData(
                    titleImage = R.raw.fast,
                    kelime = "fast",
                    kelimeAnlami = "hızlı",
                    cumle = "Be fast!"
                ),


                )
            wordsList.forEach { repository.addWords(it) }
        }
    }

}