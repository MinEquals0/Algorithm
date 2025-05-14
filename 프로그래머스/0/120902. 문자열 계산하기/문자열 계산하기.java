import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int result = Integer.parseInt(arr[0]);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
        
        for(int i = 1; i < arr.length; i+=2){
            String s = arr[i];
            int num = Integer.parseInt(arr[i+1]);
            
            if(s.equals("+")){
                result += num;
            } else if(s.equals("-")){
                result -= num;
            }
        }
        
        
        return result;
        
    }
}