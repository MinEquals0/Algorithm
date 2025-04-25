import java.util.*;

class Solution {
    public int solution(int[] array) {
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i : array){
            list.add(i);
        }
        
        Collections.sort(list);
        int mid = list.size()/2;
        
        return list.get(mid); 
        
    }
}