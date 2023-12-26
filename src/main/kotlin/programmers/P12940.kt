package programmers
// 12940 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
class P12940 {
    fun solution(n: Int, m: Int): IntArray {
        if(n < m){
            var gcd = GCD(n,m)
            var lcm = LCM(n,m,gcd)
            return  arrayOf(gcd,lcm).toIntArray()
        }else{
            var gcd = GCD(m,n)
            var lcm = LCM(m,n,gcd)
            return  arrayOf(gcd,lcm).toIntArray()
        }
    }

    fun GCD(n: Int, m: Int): Int {
        return if (m == 0) {
            n
        } else {
            GCD(m, n % m)
        }
    }

    fun LCM(n1: Int, n2: Int, gcd: Int):Int {
        return n1 * n2 / gcd
    }
}