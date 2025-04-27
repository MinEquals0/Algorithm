import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        // sort에서 대문자가 소문자보다 우선순위 높음
        for(int i = 0; i < arr.length; i++){
            arr[i] = Character.toLowerCase(arr[i]);
        }
        
        Arrays.sort(arr);
        
        String answer = String.valueOf(arr);
        
        return answer;
    }
}