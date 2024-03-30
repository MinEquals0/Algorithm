import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // intervals 의 값을 int 변수로 만들기 - 구간값
        // for 문을 돌기 -> 범위를 구간값으로 주고, arr 배열 순회
        // 자른 배열값을 담을 새 배열을 만들어서 저장
        
        ArrayList<Integer> al = new ArrayList<>();
        int a = intervals[0][0];
        int b = intervals[0][1];

        int c = intervals[1][0];
        int d = intervals[1][1];

        for(int i = a; i <= b; i++){
            al.add(arr[i]);
        }

        for(int i = c; i <= d; i++){
            al.add(arr[i]);
        }
        return al.stream().mapToInt(t -> t).toArray();
    }
}