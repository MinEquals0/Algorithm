import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        // List<Integer> list = new ArrayList<>();
        
        // for(int i = 0; i < my_string.length(); i++){
        //     if(Character.isDigit(my_string.charAt(i))){
        //         int num = my_string.charAt(i) - '0';
        //         list.add(num);
        //     }
        // }
        // list.sort(null);
        
        // // list -> int[]
        // int[] arr = new int[list.size()];
        
        // for(int i = 0; i < list.size(); i++){
        //     arr[i] = list.get(i);    
        // }

        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                list.add(c - '0');
            }
        }
        
        // list -> int[]
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);    
        }
        Arrays.sort(arr);
        
        return arr;
    }
}
