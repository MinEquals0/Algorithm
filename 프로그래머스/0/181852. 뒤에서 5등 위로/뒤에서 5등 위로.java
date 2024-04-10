import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
       // sort()로 정렬한 다음에 인덱스 5번부터 끝까지 저장
        // 값을 저장할 ArrayList 생성

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(num_list);

        for(int i = 5; i < num_list.length; i++){
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(t -> t).toArray();
    }
}