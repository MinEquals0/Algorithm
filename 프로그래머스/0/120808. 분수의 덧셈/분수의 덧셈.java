class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 통분
        int n = (numer1 * denom2) + (numer2 * denom1);
        int d = denom1 * denom2;
        
        // 최대공약수로 약분 - 기약분수
        int g = gcd(n, d);
        answer[0] = n / g;
        answer[1] = d / g;
        
        
        return answer;
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    } 
}