import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
         // arr배열을 for문으로 돌면서 delete_list 요소랑 같은지 if 문으로 확인 - 이중 for문
        // 같지 않은 값만 ArrayList에 저장 -> 리턴
        ArrayList<Integer> list = new ArrayList<>();

        a:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]) { // 조건 
                    continue a;
                }
            } list.add(arr[i]);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}