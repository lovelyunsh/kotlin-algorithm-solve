package programmers

import java.util.PriorityQueue

// P138477 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
class P138477 {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var queue: PriorityQueue<Int> = PriorityQueue()
        for (i in score){
            queue.add(i)
            if(queue.size > k){
                queue.poll()
            }
            answer.add(queue.peek())
        }
        return answer.toIntArray()
    }
}