import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        
        String[] words = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            for(String word : words){
                str = str.replace(word, " ");
            }
            
            if(!str.matches(".*[a-zA-Z].*")){
                cnt++;
            }
        
        }
        
        return cnt;
    }
}