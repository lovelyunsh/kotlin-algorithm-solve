package programmers

// P86501 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86501
class P86501 {
    fun solution(numbers: IntArray) = (0..9).filter { it !in numbers }.sum()
    fun solution2(numbers: IntArray) = (0..9).filterNot(numbers::contains).sum()
    fun solution3(numbers: IntArray) = (0..9).sum() - numbers.sum()
}