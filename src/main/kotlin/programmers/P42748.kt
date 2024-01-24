package programmers

// 42748 K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
class P42748 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        commands.forEach {
            answer = answer.plus(array.sliceArray(it[0] - 1 until it[1]).sorted()[it[2] - 1])
        }

        return answer
    }
}