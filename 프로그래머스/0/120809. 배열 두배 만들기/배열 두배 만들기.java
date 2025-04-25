import java.util.*;


class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : numbers){
            list.add(i * 2);
        }
        
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}