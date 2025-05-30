class Solution {
    public int solution(int a, int b) {
        
        int g = gcd(a, b);
        
        int den = b / g;
        
        while(den % 2 == 0) {
            den /= 2;
        }
        while(den % 5 == 0){
            den /= 5;
        }
        
        
        
        if(den == 1) {
            return 1;
        } else {
            return 2;
        }
    }
    
    // 최대공약수 구하는 메서드
    public int gcd(int a, int b) {
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}