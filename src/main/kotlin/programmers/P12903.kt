package programmers

// 12903 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
class P12903 {
    fun solution(s: String) = s.substring(s.length / 2 - if (s.length % 2 == 0) 1 else 0, s.length / 2 + 1)

}