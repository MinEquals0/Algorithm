import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 배열 + 정렬
       /* Arrays.sort(phone_book);
        
        boolean answer = true;
        
        for(int i = 0; i < phone_book.length-1; i++){ 
            
            // 짧은 문자열.startsWith(긴 문자열)
            boolean isPrefix = phone_book[i+1].startsWith(phone_book[i]);
            
            // 접두어로 있으면 F
            if(isPrefix){
                answer = false;
            }
            
        }
        
        return answer;
        */


        // 2. 문제에 맞게 해시 사용하기
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

