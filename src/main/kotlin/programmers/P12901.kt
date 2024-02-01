package programmers

import java.util.*

// 12901 2016년
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
class P12901 {
    fun solution(a: Int, b: Int) =
        arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")[Calendar.getInstance().also { it.set(2016, a - 1, b) }
            .let { it.get(Calendar.DAY_OF_WEEK) - 1 }]


}