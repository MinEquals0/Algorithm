import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            boolean del = false;
            
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    del = true;
                    break;
                }
            }
            
            if(!del){
                list.add(arr[i]);
            }
        }
        
       // System.out.println(list);


        // 방법 2.
        // Set<Integer> set = new HashSet<>();
        // for(int n : delete_list){
        //     set.add(n);
        // }
        
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i : arr){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
