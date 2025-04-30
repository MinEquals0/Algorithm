class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int num = 1; num <= n; num++){
            int cnt = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    cnt++;
                }
            }
            
            if(cnt >= 3){
                answer++;
            }
        }
        
        return answer;
        
        
    }
}