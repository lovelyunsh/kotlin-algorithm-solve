package programmers


// 12933 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
class Solution {
    fun solution(n: Long): Long {
        var stringArray = n.toString().toCharArray()
        stringArray.sortDescending()
        return String(stringArray).toLong()
    }
}

fun main(){
    var testCase = Solution()
    testCase.solution(118372)
}