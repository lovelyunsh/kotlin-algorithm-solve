package programmers

// P82612 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
class P82612 {
    fun solution(price: Int, money: Int, count: Int): Long =
        (Array(count) { (it + 1) * price * 1L }.sum() - money).let { if (it < 0) 0 else it }
}