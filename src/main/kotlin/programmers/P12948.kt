package programmers

// 12948 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
class P12948 {
    fun solution(phone_number: String) =
        String(phone_number.mapIndexed() { index, c -> if (index < phone_number.length - 4) '*' else c }.toCharArray())
}