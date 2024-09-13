# PictureEnglishCard
Turkish-English Word List App
Hey there! 👋 Welcome to my Turkish-English Word List App, designed to help you learn and track words between Turkish and English. Let me walk you through how it works!

What's the idea? 🤔
This app is designed to help you learn at least 50 words in both Turkish and English. The app shows you a list of words, and you can track your progress as you learn each one!

How it works 💡
Two Tabs: The app has two main sections:

Tab 1: Displays a list of 50 randomly sorted words. When you click on a word, a popup or a detail page will open. You can mark a word as "Learned" by clicking the "Learned" button.
Tab 2: Shows the list of words you’ve marked as "Learned." These words are removed from Tab 1. If you want to mark a word as "Unlearned," just click it in Tab 2, and it will go back to Tab 1.
Swipe to Refresh: Don’t like the order of the words in Tab 1? No problem! Just swipe down on the list to reshuffle the words randomly.

Word Details: Clicking on a word opens either a popup or a detail page. In Tab 2, you'll see an "Unlearned" button that allows you to move the word back to the main list.

Data Storage: The app uses SharedPreferences to store which words you've learned, so your progress is saved even after closing the app.

The Tech Behind It ⚙️

RecyclerView / ViewPager: To display the word lists in a clean and flexible way.
BottomNavigationView: For switching between the "Random Word List" and "Learned Words" sections.
DataBinding / ViewBinding: To efficiently bind UI elements and keep the code cleaner.
Jetpack Navigation: For smooth transitions between screens (and making the popups look great).
SharedPreferences: For saving the "Learned" and "Unlearned" word states.

How to run it 🚀

Clone the repo, open it in Android Studio, and hit that “Run” button! 🎉 You're ready to start learning Turkish-English words!
