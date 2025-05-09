import java.util.*;


class Solution {
    public int[] solution(int n) {

        // 중복 제거, 오름차순도 동시에 해결
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        int i = 2;

        while(n != 0 && i <= n){
            if(n % i == 0){
                set.add(i);
                n = n / i; // n을 i로 계속 나누기
            } else {
                i++;  // i를 증가시켜서 더 큰 수를 시도
            }
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
    
}
