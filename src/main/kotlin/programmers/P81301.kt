package programmers

class P81301 {

    val numMap: HashMap<String, String> = hashMapOf(
        Pair("zero", "0"),
        Pair("one", "1"),
        Pair("two", "2"),
        Pair("three", "3"),
        Pair("four", "4"),
        Pair("five", "5"),
        Pair("six", "6"),
        Pair("seven", "7"),
        Pair("eight", "8"),
        Pair("nine", "9")
    )
    fun solution(s: String): Int {
        var newS = s
        numMap.forEach { (t, u) -> newS = newS.replace(t, u) }
        return s.toInt()
    }

}