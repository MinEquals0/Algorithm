import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        
        // 1. 모든 전화번호를 Set에 저장
        for(String s : phone_book){
            set.add(s);
        }
        
        // 2. 각 전화번호의 접두어 검사
        for(String s : phone_book){
            for(int i = 0; i < s.length(); i++){
                String prefix = s.substring(0,i);
                
                if(set.contains(prefix)){
                    return false;
                }
            }
            
        }
        
        return true;
        
    }
}

