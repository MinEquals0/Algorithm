import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList<Integer> list = new ArrayList<>();
        
        // for(int i = n-1; i < num_list.length; i++){
        //     list.add(num_list[i]);
        // }
        
        // return list.stream().mapToInt(Integer:: intValue).toArray();

        int[] arr = Arrays.copyOfRange(num_list, n-1, num_list.length);
        return arr;
    }
}
