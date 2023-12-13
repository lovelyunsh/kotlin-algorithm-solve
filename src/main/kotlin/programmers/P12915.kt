package programmers

// 12915 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
class P12915 {
    fun solution(strings: Array<String>, n: Int): Array<String> =
        strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()

}