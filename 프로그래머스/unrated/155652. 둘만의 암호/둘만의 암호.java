class Solution {
    public String solution(String s, String skip, int index) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int count = 0;
            while (count < index) {
                c = (char) (c == 'z' ? 'a' : c + 1);
                if (skip.indexOf(c) == -1) {
                    count++;
                }
            }
            chars[i] = c;
        }
        return new String(chars);
    }
}