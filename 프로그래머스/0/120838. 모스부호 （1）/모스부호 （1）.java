import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < morse.length; i++){
            map.put(morse[i], String.valueOf((char)('a'+i))); 
        }
        
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
                
        for(String key : arr){
            sb.append(map.get(key));
        }
        
        return sb.toString();
    }
}
