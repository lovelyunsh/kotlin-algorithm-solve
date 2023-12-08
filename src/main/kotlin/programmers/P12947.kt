package programmers

// 12947 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
class P12947 {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        x.toString().toCharArray().forEach { c: Char -> sum += c.digitToInt() }
        return x % sum == 0
    }
}