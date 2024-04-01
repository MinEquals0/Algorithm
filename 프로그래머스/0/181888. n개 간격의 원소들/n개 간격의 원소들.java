import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // for문으로 num_list 돌면서 n++ 증가하면서 요소 저장
        // 요소를 저장할 배열을 생성 - arraylist
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < num_list.length; i += n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(t -> t).toArray();
    }
}