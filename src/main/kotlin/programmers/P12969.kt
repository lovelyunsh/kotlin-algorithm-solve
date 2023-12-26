package programmers
// 12969 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969
fun main(args: Array<String>) {
    val (a, b) = readln().split(' ').map(String::toInt)
    var star = String(CharArray(a) { '*' })
    for(i in 0 until b){
        println(star)
    }
}