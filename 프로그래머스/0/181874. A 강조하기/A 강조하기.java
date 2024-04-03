class Solution {
    public String solution(String myString) {
        // 문자열 문제 - 메소드로 대부분 풀 수 있음
        // 모든 문자를 먼저 소문자로 바꾸고, a는 replace() A로 바꾸기

        myString = myString.toLowerCase();
        myString = myString.replace("a", "A");
        return myString;
    }
}