import java.util.*;


class Solution {
    public int[] solution(int n) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 2;
        
        while(i * i <= n){
            while(n % i == 0){
                set.add(i);
                n = n / i;
            }
            i++;
        }
        
        if(n > 1){
            set.add(n);
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
    
}