package programmers

// 12918 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
class P12918 {
    fun solution(s: String): Boolean = s.length in arrayOf(4, 6) && s.matches(Regex("^[0-9]+$"))
}