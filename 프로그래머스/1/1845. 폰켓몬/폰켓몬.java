import java.util.*;


class Solution {
    public int solution(int[] nums) {
        // nums에서 다른 수가 몇개인지
        // 0이 아닌 수를 카운트
        
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 몇 번 나오는지 카운트
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            System.out.println(map.get(i));
        }
        
        // 0이 아닌 수 카운트
        for(int key : map.keySet()){
            if(map.get(key) != 0){
                answer++;
            }
            
        }
        
        return Math.min(answer, nums.length/2);
    }
}