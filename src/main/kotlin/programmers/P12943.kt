package programmers

// 12943 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
class P12943 {
    fun solution(num: Int): Int {
        var count = 0
        var checkNum = num.toLong()
        while(count < 500){
            if(checkNum == 1L) break
            checkNum = if(checkNum % 2 == 0L) checkNum / 2 else checkNum * 3 + 1
            count++
        }
        return if(count > 500) -1 else count
    }

}