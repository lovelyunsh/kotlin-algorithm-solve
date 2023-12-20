package programmers;
// P77884 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class P77884 {
    fun solution(left: Int, right: Int) = (left..right).fold(0) { acc, i -> acc + if (yaksu(i) % 2 == 0) i else -i }

    fun solution2(left: Int, right: Int) = (left..right).sumOf { if (yaksu(it) % 2 == 0) it else -it }
    fun yaksu(n: Int) = (1..n).filter { n % it == 0 }.count()

}
