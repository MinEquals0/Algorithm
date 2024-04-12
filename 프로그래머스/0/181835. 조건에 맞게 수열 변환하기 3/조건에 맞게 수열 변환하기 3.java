import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // k 홀수 - arr 모든 원소에 * k
        // 짝수 - arr 모든 원소에 + k

        // if문으로 k가 홀/짝 분기
        // arr 배열을 for문으로 돌면서 계산 - ArrayList에 저장

        ArrayList<Integer> list = new ArrayList<>();

        if(k % 2 == 0) {
            for(int i : arr){
                list.add(i + k);
            }
        } else {
            for(int i : arr){
                list.add(i * k);
            }
        }
        return list.stream().mapToInt(t -> t).toArray();
    }
}