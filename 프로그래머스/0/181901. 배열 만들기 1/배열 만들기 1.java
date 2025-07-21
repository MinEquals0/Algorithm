import java.util.*;


class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 1;
        
        while(i <= n){
            if(i % k == 0){
                list.add(i);
            }
            i++;
            
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}