package programmers
// 68935 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
class P68935 {

    fun solution(n: Int): Int {
        var answer: Int = 0
        var stringBuilder = StringBuilder()
        var num = n
        while(num > 0){
            stringBuilder.append(num % 3)
            num /= 3
        }
        var threeString = stringBuilder.reverse().toString()
        var gob = 1
        for(i in threeString.indices){
            answer += threeString[i].digitToInt() * gob
            gob *= 3
        }
        return answer
    }

}