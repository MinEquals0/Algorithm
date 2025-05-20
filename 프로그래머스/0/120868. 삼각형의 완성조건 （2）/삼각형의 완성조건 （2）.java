import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int sideMin = sides[0] < sides[1] ? sides[0] : sides[1];
        int sideMax = sides[0] < sides[1] ? sides[1] : sides[0];
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= sideMax; i++){
            if((sideMax-sideMin) < i && i <= sideMax) {
                set.add(i);
            }  
        }
        
        for(int i = sideMax+1; i < sideMin+sideMax; i++){
            set.add(i);
        }
        
        return set.size();

        // 수학적 풀이 방식으로
        // int answer = 0;
        // int max = Math.max(sides[0], sides[1]);
        // int min = Math.min(sides[0], sides[1]);

        // answer += min * 2 - 1;

        // return answer;
    }
}
