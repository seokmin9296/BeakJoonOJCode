class Solution {
    public String solution(int n) {
        char[] characters = new char[n];
        for(int i = 0 ; i < n ; i ++){
            characters[i] = (i % 2 == 0) ? '수' : '박';
        }
        String answer = String.valueOf(characters);
        return answer;
    }
}