package programmers

class P42840 {
    fun solution(answers: IntArray): IntArray {
        return usingMod(answers)
    }


    fun usingMod(answers: IntArray): IntArray {
        var answer = intArrayOf()

        var one = arrayOf(1, 2, 3, 4, 5)
        var two = arrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var three = arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var answerArray = arrayOf(one, two, three)

        var score = IntArray(3)

        for (i in answers.indices) {
            for (j in answerArray.indices) {
                var index = i % answerArray[j].size
                if (answers[i] == answerArray[j][index]) score[j]++
            }
        }
        for (i in score.indices)
            if (score[i] == score.maxOf { it }) answer = answer.plus(i + 1)

        return answer
    }
}