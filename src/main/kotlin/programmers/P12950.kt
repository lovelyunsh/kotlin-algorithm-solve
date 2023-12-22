package programmers
// 12950 행렬의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12950
class P12950 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        arr1.mapIndexed() { i, el -> el.mapIndexed() { j, ele -> ele + arr2[i][j] }.toIntArray() }.toTypedArray()

}