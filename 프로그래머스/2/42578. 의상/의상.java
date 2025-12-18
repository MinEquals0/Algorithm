import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        
        Map<String, Integer> map = new HashMap<>();
        
        // 종류별 의상 개수
        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0)+1);
            
        }
        
        // for (String key : map.keySet()) {
        //      System.out.println("key = " + key + ", value = " + map.get(key));
        // }
        
        // 조합 개수
        int answer = 1;
        
        for(int i : map.values()){
            answer *= i + 1;
        }
            
    
        return answer - 1;
    }
}