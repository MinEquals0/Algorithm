class Solution {
    // public int solution(int n) {
    //     // (n * x) / 6 의 몫을 구하기
        
    //     int i = 1;
        
    //     while(true){
    //         if((n * i) % 6 == 0) {
    //             return (n * i) / 6;
    //         }   
    //         i++;
    //     }
    //}

    public int solution(int n) {
        int answer = lcm(n, 6);
        return answer/6;
    }
    
    private int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
        
    private int gcd(int a, int b){
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
