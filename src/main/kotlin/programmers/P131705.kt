package programmers
// 131705 삼총사
// https://school.programmers.co.kr/learn/courses/30/lessons/131705
class P131705 {
    lateinit var numberArray:IntArray
    var count:Int = 0
    fun solution(number: IntArray): Int {
        numberArray = number
        comb(0,0,0)
        return count
    }

    tailrec fun comb(sel:Int,idx:Int,sum:Int){
        if(sel == 3){
            if(sum == 0) count++
            return
        }else {
            for(i in idx until numberArray.size){
                comb(sel+1,i+1,sum + numberArray[i])
            }
        }
    }
}