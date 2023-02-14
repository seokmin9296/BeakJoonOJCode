class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val chars = s.toCharArray()
    for (i in chars.indices) {
        var c = chars[i]
        var count = 0
        while (count < index) {
            c = if (c == 'z') 'a' else c + 1
            if (skip.indexOf(c) == -1) {
                count++
            }
        }
        chars[i] = c
    }
    return String(chars)
    }
}