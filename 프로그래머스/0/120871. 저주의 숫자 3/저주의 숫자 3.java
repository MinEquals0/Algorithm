import java.util.*;

class Solution {
    public int solution(int n) {
        
        int num = 0;
        int cnt = 0;  
        while(true){ 
            num++;
            if(num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            cnt++;
            
            if(cnt == n) {
                return num;
            }
        }
    }
}