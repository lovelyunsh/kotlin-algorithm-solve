package programmers

// 142086 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
class P142086 {

    fun solution(s: String): IntArray =
        s.mapIndexed { index, c -> s.substring(0, index).lastIndexOf(c) }
            .mapIndexed { index: Int, i: Int -> if (i != -1) index - i else i }.toIntArray()

    fun solution2(s: String): IntArray =
        s.mapIndexed { index, c ->
            s.substring(0, index).lastIndexOf(c).let { if (it != -1) index - it else -1 } }.toIntArray()
}