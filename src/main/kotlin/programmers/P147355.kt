package programmers
// 147355 크기가 작은 부분문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
class P147355 {
    fun solution(t: String, p: String): Int =
        t.mapIndexed { index, _ ->
            if (index + p.length <= t.length) t.subSequence(index, index + p.length).toString().toLong()
            else Long.MAX_VALUE
        }.count { it < p.toLong() }
}