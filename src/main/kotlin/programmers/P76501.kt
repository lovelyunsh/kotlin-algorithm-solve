package programmers

// 76501 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
class P76501 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.mapIndexed { index, num -> (if (signs[index]) num else -num) }.sum()

    fun solution2(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.foldIndexed(0) { index, acc, i -> if (signs[index]) acc + i else acc - i }
}