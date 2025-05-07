import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            
            if (str.equals("Z")) {
                sum -= Integer.parseInt(arr[i - 1]); 
            } else {
                sum += Integer.parseInt(str); 
            }
        }
        
        return sum;
    }
}