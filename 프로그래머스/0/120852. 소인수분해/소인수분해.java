import java.util.*;


class Solution {
    public int[] solution(int n) {
        
        Set<Integer> set = new HashSet<>();
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
        Arrays.sort(answer);
        
        return answer;
    }
    
}