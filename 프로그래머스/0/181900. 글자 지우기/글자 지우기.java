import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> indexSet = new HashSet<>();
        
        // 제거할 인덱스
        for(int i : indices){
            indexSet.add(i);
        }
        
        // 글자 제거
        for(int i = 0; i < my_string.length(); i++){
            if(!indexSet.contains(i)){
                sb.append(my_string.charAt(i));
            }
        }
        
        
        return sb.toString();
    }
}