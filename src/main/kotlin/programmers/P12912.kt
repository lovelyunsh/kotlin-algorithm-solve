package programmers

// 12912 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912

class P12912 {
    fun solution(a: Int, b: Int): Long {
        var min = a.coerceAtLeast(b)
        var max = a.coerceAtMost(b)
        return (min.toLong()..max.toLong()).sum()
    }
}