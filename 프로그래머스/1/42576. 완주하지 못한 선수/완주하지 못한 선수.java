import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 수 세기
        for(String s : participant){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        // 완주자는 -1로 수를 줄여 빼기
        for(String c : completion){
            map.put(c, map.get(c)-1);
        }
        
        // 0이 아닌 사람이 완주 못한 사람
        for(String k : map.keySet()){
            if(map.get(k) != 0){
                return k;
            }
        }
        return "";
    }
}