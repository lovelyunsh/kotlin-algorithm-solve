package programmers

// P132267 푸드 파이트 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
class P132267 {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var need = a
        var give = b
        var empty = n

        while (empty >= need) {
            var coke = empty / need
            answer += coke * give
            empty += coke * give
            empty -= coke * need
        }

        return answer
    }
}