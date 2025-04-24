class Solution {
    public int solution(int n) {
        // 나머지가 0아닐 때 n / 7 했을 때 몫 +1 
        // 나머지가 0일때만 그냥 몫 리턴
        return n % 7 == 0 ? (n / 7) : (n / 7) + 1; 
            
    }
}