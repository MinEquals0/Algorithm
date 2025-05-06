import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("[a-zA-Z]+");
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                int num = Integer.parseInt(arr[i]);
                answer += num;
            }
        }
        
        return answer;
    }
}