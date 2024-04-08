import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // sort() 사용해서 정렬을 한 후, copyOfRange 사용해서 리턴
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list,0,5);
    
    }
}