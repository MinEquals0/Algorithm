import java.util.*;


class Solution {
    public int solution(int[] nums) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 포켓몬 종류 개수 세기
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        //System.out.println("포켓몬 개수 : " + map.size());
        //System.out.println("가질 수 있는 개수 : " + (nums.length)/2);
        
        // 가질 수 있는 포켓몬 개수
        int availableCnt =  nums.length/2;
        int totalSpecies = map.size();
        
        return totalSpecies > availableCnt ? availableCnt : totalSpecies;
        
        
    }
}