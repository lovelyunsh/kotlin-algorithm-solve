package programmers

// 12917 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
class P12917 {
    fun solution(s: String): String =
        String(s.toCharArray().sortedArrayDescending())

}