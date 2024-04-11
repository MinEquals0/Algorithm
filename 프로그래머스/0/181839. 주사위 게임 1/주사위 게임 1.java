class Solution {
    public int solution(int a, int b) {
        // a, b 가 모두 홀수 - a^2 + b^2
        // a, b 중 하나 홀수 - 2 * (a + b)
        // a, b 모두 짝수 - |a - b|
        // if, else if 사용해서 각 경우의 수에 해당하는 계산을 한 후 리턴

        if(a % 2 == 1 && b % 2 ==1){
            return (int)(Math.pow(a, 2) + Math.pow(b, 2));  // 리턴값이 double
        } else if(a % 2 == 1 || b % 2 == 1){
            return 2 * (a + b);
        } else {
            return Math.abs(a-b);
        }
    }
}