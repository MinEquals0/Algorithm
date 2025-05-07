import java.util.*;

class Solution {
    public String solution(String s) {
        String copy = s;
        
        for(int i = 0; i < copy.length(); i++){
            char target = copy.charAt(i);
            
            for(int j = i+1; j < copy.length(); j++){
                if(target == copy.charAt(j)){
                    s = s.replaceAll(target+"", "");
                }
            }
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
       
        
        return new String(arr);
        
        
    }
}