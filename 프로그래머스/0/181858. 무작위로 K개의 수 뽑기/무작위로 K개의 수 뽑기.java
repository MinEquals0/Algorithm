import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        boolean[] bool = new boolean[100000];
        int[] newArr = new int[k];
        Arrays.fill(newArr, -1); // 배열을 -1로 초기화
        int idx = 0;

        for(int i = 0; i < arr.length; i++){
            if(!bool[arr[i]]){ // bool 배열의 요소가 false 일 때
                bool[arr[i]] = true;
                newArr[idx++] = arr[i];
            }
            if(idx >= k) {
                break;
            }
        }
        return newArr;
    }
}