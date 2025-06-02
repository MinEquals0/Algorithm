import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
       
        List<Integer> list = new ArrayList<>();
        
        for(int num : numlist){
            list.add(num);
        }
        
        // 차이가 적인 값, 큰 수 먼저 정렬
        list.sort((a,b) -> {
            int diffA = Math.abs(n - a);
            int diffB = Math.abs(n - b);
            
            if(diffA != diffB){
                return diffA - diffB; // 차이가 적은 수 먼저     
            } else {
                return b - a;  // 같은 차이일 때는, 큰 수 먼저
            }
        });

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}