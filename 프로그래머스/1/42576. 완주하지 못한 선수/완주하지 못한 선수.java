import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록
        for(String s : participant){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        // 완주자 목록을 돌면서 일치하면 -1
        for(String s : completion){
            map.put(s, map.get(s)-1);
        }
        
        // key값이 0이 아니면 return
        for(String s : map.keySet()){
            if(map.get(s) != 0){
                return s;
            }
        }
        
        return "";
    }
}