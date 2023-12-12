package programmers

// 12910 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
class P12910 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val filterList = arr.sorted().filter { i -> i % divisor == 0 }
        return if(filterList.isEmpty()) intArrayOf(-1) else filterList.toIntArray()
    }
}