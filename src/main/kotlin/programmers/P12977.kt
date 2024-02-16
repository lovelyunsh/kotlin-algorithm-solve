package programmers

// 12977 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
class P12977 {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    var num = nums[i] + nums[j] + nums[k]
                    if (checkNum(num)) answer++
                }
            }
        }
        return answer
    }

    fun checkNum(num: Int): Boolean {
        var divider = 2
        while (divider * divider <= num) {
            if (num % divider == 0)
                return false
            divider++
        }
        return true
    }
}