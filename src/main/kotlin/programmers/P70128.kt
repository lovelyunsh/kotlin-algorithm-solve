package programmers

// 70128 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
class P70128 {
    fun solution(a: IntArray, b: IntArray) = a.foldIndexed(0){ index, acc, _ -> acc + a[index] * b[index] }
}