import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = start; i >= end_num; i--){
            al.add(i);
        }

        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}