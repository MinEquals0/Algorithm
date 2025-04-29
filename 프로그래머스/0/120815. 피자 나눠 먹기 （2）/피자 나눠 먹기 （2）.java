class Solution {
    public int solution(int n) {
        // (n * x) / 6 의 몫을 구하기
        
        int i = 1;
        
        while(true){
            if((n * i) % 6 == 0) {
                return (n * i) / 6;
            }   
            i++;
        }
    }
}