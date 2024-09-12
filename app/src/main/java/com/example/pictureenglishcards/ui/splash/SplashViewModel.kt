package com.example.pictureenglishcards.ui.splash


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pictureenglishcards.model.ClassData
import com.example.pictureenglishcards.data.repository.WordRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: WordRepository
) : ViewModel() {

    fun addSampleWords() = viewModelScope.launch {

        val w1 = ClassData(
            titleImage = " R.raw.big",
            kelime = "big",
            kelimeAnlami = "Büyük",
            cumle = "What a big house!"
        )
        val w2 = ClassData(
            titleImage = null,
            kelime = "cold",
            kelimeAnlami = "soğuk",
            cumle = "This room is cold."
        )
        val w3 = ClassData(
            titleImage = "R.raw.bad",
            kelime = "sad",
            kelimeAnlami = "üzgün",
            cumle = "This food smells so bad."
        )
        val w4 = ClassData(
            titleImage = "R.raw.cheap",
            kelime = "new",
            kelimeAnlami = "yeni",
            cumle = "I love my new jacket."
        )
        val w5 = ClassData(
            titleImage = "R.raw.have",
            kelime = "have",
            kelimeAnlami = "sahip olmak",
            cumle = "I'm so rich when I have you."
        )
        val w6 = ClassData(
            titleImage = null,
            kelime = "do",
            kelimeAnlami = "yapmak",
            cumle = "He does so much thing for me."
        )
        val w7 = ClassData(
            titleImage = "R.raw.go",
            kelime = "go",
            kelimeAnlami = "gitmek",
            cumle = "Go and don't come back."
        )
        val w8 = ClassData(
            titleImage = "R.raw.see",
            kelime = "see",
            kelimeAnlami = "görmek",
            cumle = "When i see u i feel like my heart is going to exoplode"
        )
        val w9 = ClassData(
            titleImage = null,
            kelime = "eat",
            kelimeAnlami = "yemek",
            cumle = "I love to eat!"
        )
        val w10 = ClassData(
            titleImage = null,
            kelime = "read",
            kelimeAnlami = "okumak",
            cumle = "I read Harry Potter again."
        )
        val w11 = ClassData(
            titleImage = "R.raw.have",
            kelime = "play",
            kelimeAnlami = "oynamak",
            cumle = "I don't like play LOL"
        )
        val w12 = ClassData(
            titleImage = null,
            kelime = "drink",
            kelimeAnlami = "içmek",
            cumle = "let's some drink."
        )
        val w13 = ClassData(
            titleImage = null,
            kelime = "difficult",
            kelimeAnlami = "zor",
            cumle = ""
        )
        val w14 = ClassData(
            titleImage = "R.raw.go",
            kelime = "different",
            kelimeAnlami = "farklı",
            cumle = "You are different."
        )
        val w15 = ClassData(
            titleImage = null,
            kelime = "happy",
            kelimeAnlami = "mutlu",
            cumle = "I am very happy because of you."
        )
        val w16 = ClassData(
            titleImage = "R.raw.bad",
            kelime = "bad",
            kelimeAnlami = "Kötü",
            cumle = "A bad smell!"
        )
        val w17 = ClassData(
            titleImage = null,
            kelime = "comfortable",
            kelimeAnlami = "rahat",
            cumle = "This bed is very comfortable."
        )
        val w18 = ClassData(
            titleImage = " R.raw.cheap",
            kelime = "quiet",
            kelimeAnlami = "sessiz",
            cumle = "Be quiet, I'm trying to understand.."
        )

        val w19 = ClassData(
            titleImage = "R.raw.cheap",
            kelime = "cheap",
            kelimeAnlami = "ucuz",
            cumle = "My new jacket is very cheap."
        )
        val w20 = ClassData(
            titleImage = null,
            kelime = "want",
            kelimeAnlami = "istemek",
            cumle = "I want it."
        )

        val w21 = ClassData(
            titleImage = "R.raw.cheap",
            kelime = "need",
            kelimeAnlami = "ihtiyaç duymak",
            cumle = "I need to hug you."
        )
        val w22 = ClassData(
            titleImage = null,
            kelime = "try",
            kelimeAnlami = "denemek",
            cumle = "let's try again!"
        )
        val w23 = ClassData(
            titleImage = null,
            kelime = "know",
            kelimeAnlami = "bilmek",
            cumle = "He know mw!"
        )
        val w24 = ClassData(
            titleImage = "R.raw.bulmak",
            kelime = "find",
            kelimeAnlami = "bulmak",
            cumle = "I found my pen."
        )
        val w25 = ClassData(
            titleImage = null,
            kelime = "important",
            kelimeAnlami = "önemli",
            cumle = "This point is important."
        )
        val w26 = ClassData(
            titleImage = "R.raw.cheap",
            kelime = "useful",
            kelimeAnlami = "kullanışlı",
            cumle = "Learning a second language can be extremely useful for traveling and career opportunities."
        )
        val w27 = ClassData(
            titleImage = null,
            kelime = "efficient",
            kelimeAnlami = "verimli",
            cumle = "The new software update made the system more efficient, reducing processing time by half."
        )
        val w28 = ClassData(
            titleImage = null,
            kelime = "reliable",
            kelimeAnlami = "güvenilir",
            cumle = "Choosing a reliable car ensures fewer breakdowns and less maintenance hassle over the years"
        )
        val w29 = ClassData(
            titleImage = "R.raw.go",
            kelime = "unusual",
            kelimeAnlami = "alışılmadık",
            cumle = "Her approach to problem-solving was unusual but highly effective."
        )
        val w30 = ClassData(
            titleImage = null,
            kelime = "dangerous",
            kelimeAnlami = "tehlikeli",
            cumle = "it's dangerous there."
        )
        val w31 = ClassData(
            titleImage = null,
            kelime = "familiar",
            kelimeAnlami = "tanıdık",
            cumle = "The layout of the new office was familiar, making it easy for employees to adapt quickly."
        )
        val w32 = ClassData(
            titleImage = null,
            kelime = "decide",
            kelimeAnlami = "karar vermek",
            cumle = "I decide, you will go."
        )
        val w33 = ClassData(
            titleImage = " R.raw.idk5",
            kelime = "argue",
            kelimeAnlami = "tartışmak",
            cumle = "During the meeting, they began to argue over the best strategy for the project."
        )
        val w34 = ClassData(
            titleImage = "R.raw.explore",
            kelime = "explore",
            kelimeAnlami = "keşfetmek",
            cumle = "Traveling to new countries allows you to explore different cultures and cuisines."
        )
        val w35 = ClassData(
            titleImage = "R.raw.have",
            kelime = "develop",
            kelimeAnlami = "geliştirmek",
            cumle = "She plans to develop her skills by taking additional courses and attending workshops."
        )
        val w36 = ClassData(
            titleImage = null,
            kelime = "manage",
            kelimeAnlami = "yönetmek",
            cumle = "He was able to manage the team effectively, ensuring all deadlines were met."
        )
        val w37 = ClassData(
            titleImage = null,
            kelime = "significant",
            kelimeAnlami = "önemli",
            cumle = "The research found a significant correlation between daily exercise and improved mental health."
        )
        val w38 = ClassData(
            titleImage = null,
            kelime = "complex",
            kelimeAnlami = "karmaşık",
            cumle = "The instructions were too complex, making it difficult to assemble the furniture correctly."
        )
        val w39 = ClassData(
            titleImage = null,
            kelime = "accurate",
            kelimeAnlami = "doğru",
            cumle = "The scientist ensured that the measurements were accurate to maintain the integrity of the experiment."
        )
        val w40 = ClassData(
            titleImage = null,
            kelime = "reasonable",
            kelimeAnlami = "makul",
            cumle = "The manager proposed a reasonable deadline for the project, allowing enough time for thorough work without causing undue stress."
        )
        val w41 = ClassData(
            titleImage = "R.raw.idk1",
            kelime = "demonstrate",
            kelimeAnlami = "göstermek",
            cumle = ""
        )
        val w42 = ClassData(
            titleImage = null,
            kelime = "implement",
            kelimeAnlami = "uygulamak",
            cumle = "The professor used experiments to demonstrate the principles of physics clearly to the students."
        )
        val w43 = ClassData(
            titleImage = null,
            kelime = "analyze",
            kelimeAnlami = "analiz etmek",
            cumle = "The company plans to implement new software to improve workflow efficiency."
        )
        val w44 = ClassData(
            titleImage = "R.raw.idk5",
            kelime = "assess",
            kelimeAnlami = "değerlendirmek",
            cumle = "The team will assess the project's progress to ensure it meets the set objectives."
        )
        val w45 = ClassData(
            titleImage = "R.raw.fast",
            kelime = "come",
            kelimeAnlami = "gelmek",
            cumle = "Come back."
        )
        val w46 = ClassData(
            titleImage = null,
            kelime = "say",
            kelimeAnlami = "söylemek",
            cumle = "I want say something."
        )
        val w47 = ClassData(
            titleImage = " R.raw.have",
            kelime = "exciting ",
            kelimeAnlami = "heycan verici",
            cumle = "Oh my god, this is so exciting!"
        )
        val w48 = ClassData(
            titleImage = null,
            kelime = "improve",
            kelimeAnlami = "geliştirmek",
            cumle = "Regular exercise can significantly improve your overall health and well-being."
        )
        val w49 = ClassData(
            titleImage = "R.raw.have",
            kelime = "achieve",
            kelimeAnlami = "başarmak",
            cumle = "With dedication and hard work, you can achieve your long-term goals."
        )
        val w50 = ClassData(
            titleImage = null,
            kelime = "effective",
            kelimeAnlami = "etkili",
            cumle = "Her new study routine proved to be highly effective in boosting her exam scores."
        )






        val list = ArrayList<ClassData>()
        list.add(w1)
        list.add(w5)
        list.add(w2)
        list.add(w3)
        list.add(w4)
        list.add(w5)
        list.add(w6)
        list.add(w7)
        list.add(w8)
        list.add(w9)
        list.add(w10)
        list.add(w11)
        list.add(w12)
        list.add(w13)
        list.add(w14)
        list.add(w15)
        list.add(w16)
        list.add(w17)
        list.add(w18)
        list.add(w19)
        list.add(w20)
        list.add(w21)
        list.add(w22)
        list.add(w23)
        list.add(w24)
        list.add(w25)
        list.add(w26)
        list.add(w27)
        list.add(w28)
        list.add(w29)
        list.add(w30)
        list.add(w31)
        list.add(w32)
        list.add(w33)
        list.add(w34)
        list.add(w35)
        list.add(w36)
        list.add(w37)
        list.add(w38)
        list.add(w39)
        list.add(w40)
        list.add(w41)
        list.add(w42)
        list.add(w43)
        list.add(w44)
        list.add(w45)
        list.add(w46)
        list.add(w47)
        list.add(w48)
        list.add(w49)
        list.add(w50)




        repository.addWord(list).catch {
            println(it.message)
        }.collect{
            println("başarılı")}}}



