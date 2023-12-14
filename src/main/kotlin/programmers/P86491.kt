package programmers

// 86491 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
class P86491 {
    fun solution(sizes: Array<IntArray>): Int {
        var longMax = 0
        var shortMax = 0
        sizes.forEach { it ->
            longMax = maxOf(it.maxOf{it},longMax)
            shortMax = maxOf(it.minOf{it},shortMax)
        }

        return longMax*shortMax
    }
}