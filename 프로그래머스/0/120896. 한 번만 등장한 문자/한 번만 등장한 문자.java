import java.util.*;

class Solution {
    public String solution(String s) {
        // String copy = s;
        
        // for(int i = 0; i < copy.length(); i++){
        //     char target = copy.charAt(i);
            
        //     for(int j = i+1; j < copy.length(); j++){
        //         if(target == copy.charAt(j)){
        //             s = s.replaceAll(target+"", "");
        //         }
        //     }
        // }
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
       
        // return new String(arr);

        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == 1) {
                sb.append((char) (i + 'a'));    
            } 
        }
        
        return sb.toString();
    }
}
