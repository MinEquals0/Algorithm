import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            
            while(!list.isEmpty() && list.get(list.size()-1) >= i){
                list.remove(list.size()-1);
            } 
            
            list.add(i);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
        
        
    }
}


  