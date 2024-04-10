class Solution {
    public int solution(String num_str) {
        // 문자열을 for문으로 돌면서 요소 하나씩 숫자로 바꿔줌
        // 누적합 - 변수 생성

        int sum = 0;

        for(int i = 0; i < num_str.length(); i++){
            int x = num_str.charAt(i) - '0';
            sum += x;
        }
        return sum;
    }
}