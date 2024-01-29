package programmers

// 134240 푸드 파이트 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
class P134240 {
    fun solution(food: IntArray): String {
        var foodString = ""
        food.forEachIndexed { index, i ->
            if (index != 0) {
                for (i in 0 until i / 2) {
                    foodString = foodString.plus(index)
                }
            }
        }
        foodString = foodString + '0' + foodString.reversed()
        return foodString
    }
}