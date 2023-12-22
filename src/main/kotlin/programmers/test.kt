package programmers

fun main() {
    var count = 100
    var price = 12000
    var money = 21300000000
    var answer = (Array(count) { (it + 1) * price * 1L }.sum() - money).let { if (it < 0) 0 else it }
    print(answer)

}