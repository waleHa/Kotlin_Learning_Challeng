/**
 * Given a string implement a function which returns longest word in that string.
 * If there are two or more words that have the same length, return the first longest word from the string.
 * Ignore punctuation. Input string can't be empty or blank string.
 */

fun findLongestWord(value: String): String {
    var longestString = ""

    var currentWord = ""
    for (l in value) {

        if (l in 'a'..'z' || l in 'A'..'Z') {
            currentWord += l
        }
        else if(currentWord!=""){
            if (currentWord.length>longestString.length){
                longestString = currentWord
                println(currentWord)
            }
            currentWord = ""
        }
    }
    return longestString
}

fun main() {
    val testSentence = "Find the longest word in this string while ignoring punctuation. " +
            "There are multiple methods for achieving this."
    println("The result is:'${findLongestWord(testSentence)}'")
}