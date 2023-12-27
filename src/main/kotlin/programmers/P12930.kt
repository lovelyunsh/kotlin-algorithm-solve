package programmers

// 12930 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
class P12930 {
    fun solution(s: String): String =
        s.split(" ").map { changeStrange(it) }.fold("") { acc, s -> "$acc$s " }.dropLast(1)


    fun changeStrange(s: String) =
        String(s.toCharArray().mapIndexed { index, c ->
            if (index % 2 == 0 && c in 'a'..'z') {
                c - ('a' - 'A')
            } else if (index % 2 == 1 && c in 'A'..'Z') {
                c + ('a' - 'A')
            } else {
                c
            }
        }.toCharArray())

}