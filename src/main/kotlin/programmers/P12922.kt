package programmers

// 12922 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
class P12922 {
    fun solution(n: Int): String = String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })
}