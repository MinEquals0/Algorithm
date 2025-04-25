import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int mid = array.length/2;
        return array[mid]; 

        // ArrayList <Integer> list = new ArrayList<>();
        
        // for(int i : array){
        //     list.add(i);
        // }
        
        // Collections.sort(list);
        // int mid = list.size()/2;
        
        // return list.get(mid); 
    }
}
