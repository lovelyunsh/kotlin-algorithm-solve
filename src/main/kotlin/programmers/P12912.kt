package programmers

class P12912 {
    fun solution(a: Int, b: Int): Long {
        var min = a.coerceAtLeast(b)
        var max = a.coerceAtMost(b)
        return (min.toLong()..max.toLong()).sum()
    }
}