package programmers

// 12933 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
class P12935 {

    fun solution(arr: IntArray): IntArray =
        arr.filter { it != arr.minOf { o -> o } }
            .let { if (it.isEmpty()) arrayOf(-1).toIntArray() else it.toIntArray() }

}