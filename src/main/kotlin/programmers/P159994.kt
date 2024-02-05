package programmers

// 159994 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
class P159994 {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0
        var index2 = 0
        goal.forEach {
            if (cards1.size != index1 && it == cards1[index1]) {
                index1++
            } else if (cards2.size != index2 && it == cards2[index2]) {
                index2++
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}