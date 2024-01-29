package programmers

// 68644 K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
class P68644 {
    fun solution(numbers: IntArray): IntArray {
        var answer: Set<Int> = setOf()
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                answer = answer.plus(numbers[i] + numbers[j])
            }
        }
        return answer.toIntArray().sorted().toIntArray()
    }
}