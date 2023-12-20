package programmers

class P12903 {
    fun solution(s: String): String = s.substring(s.length / 2 - if (s.length % 2 == 0) 1 else 0, s.length / 2 + 1)

}