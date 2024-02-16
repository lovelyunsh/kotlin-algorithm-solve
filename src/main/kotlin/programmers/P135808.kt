package programmers

// P135808 과일장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
class P135808 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        var count = IntArray(k + 1)
        score.forEach { count[it]++ }
        var index = k
        first@while (true) {
            for (i in 0 until m) {
                while (count[index] == 0) {
                    if (--index < 0) break@first
                }
                count[index]--
            }
            answer += index * m
        }
        return answer
    }
}