class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase(); // 참조값이 바뀌는 것
        pat = pat.toUpperCase();

        return myString.contains(pat) ? 1 : 0;
    }
}