package programmers

// 12926 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
class P12926 {
    fun solution(s: String, n: Int): String = String(s.map { charPlus(it, n) }.toCharArray())


    fun charPlus(char: Char, n: Int): Char {
        if (char in 'a'..'z') {
            return ((char.code - 'a'.code + n) % 26 + 'a'.code).toChar()
        } else if (char in 'A'..'Z') {
            return ((char.code - 'A'.code + n) % 26 + 'A'.code).toChar()
        } else {
            return ' '
        }
    }
}