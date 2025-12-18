import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 곱의 법칙 + 부분집합 개념으로 접근
        
        Map<String, Integer> map = new HashMap<>();
        
        // 종류별 의상 개수
        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0)+1);
            
        }

        // 확인용 출력
        // for (String key : map.keySet()) {
        //      System.out.println("key = " + key + ", value = " + map.get(key));
        // }
        
        // 조합 개수
        int answer = 1;
        
        for(int i : map.values()){
            answer *= i + 1;
        }
            
        // 전부 공집합인 경우 제외 -1
        return answer - 1;
    }
}
