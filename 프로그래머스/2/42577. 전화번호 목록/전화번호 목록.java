import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // for문 2개써서 포함여부 확인? 접두어니까 부분이 아니라 앞쪽에 위치하는지 봐야되네?
        // contains 이런함수는 못쓰고
        // 그럼 charAt() 이걸로..? 
        // 해시는 어케 쓴담?
        
        Arrays.sort(phone_book);
        
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
    }
}


